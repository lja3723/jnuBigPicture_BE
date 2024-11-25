package kr.ac.jnu.capstone.bigpicture.dongsim._common.swagger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import io.swagger.v3.core.jackson.ModelResolver;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.responses.ApiResponse;
import java.util.Arrays;
import java.util.Optional;
import kr.ac.jnu.capstone.bigpicture.dongsim._common.auth.AuthorizedEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Dongsim API",
        version = "0.1",
        description = "Dongsim API 명세서"
    )
)
public class SwaggerConfig {

    // Swagger 응답형식을 snake_case 로 정의
    @Bean
    public ModelResolver modelResolver(ObjectMapper objectMapper) {
        return new ModelResolver(objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SnakeCaseStrategy.INSTANCE));
    }

    // FailApiResponses 어노테이션에 정의된 BusinessException 에 대한 ApiResponses 초기화
    @Bean
    public OperationCustomizer operationCustomizer() {
        return (operation, handlerMethod) -> {

            // FailApiResponses 어노테이션에 정의된 ErrorCode 바탕으로 ApiResponse 추가
            Optional.ofNullable(handlerMethod.getMethodAnnotation(FailApiResponses.class))
                .map(FailApiResponses::value)
                .ifPresent(errorCodes -> Arrays.stream(errorCodes).forEach(errorCode -> {
                    ApiResponse apiResponse = new ApiResponse();
                    apiResponse.setDescription(errorCode.description);
                    apiResponse.content(new Content().addMediaType(
                        "application/json",
                        new MediaType().schema(new ObjectSchema()
                            .addProperty("status", new StringSchema().example("fail"))
                            .addProperty("message", new StringSchema().example(errorCode.message))
                        ))
                    );
                    operation.getResponses().addApiResponse(Integer.toString(errorCode.status.value()), apiResponse);
                }));

            // AuthorizedEndpoint 어노테이션이 존재하는 경우, Authorization 헤더를 추가하고 해당 파라미터 문서화에서 제외
            Arrays.stream(handlerMethod.getMethodParameters())
                .filter(methodParam -> methodParam.hasParameterAnnotation(AuthorizedEndpoint.class))
                .findAny()
                .ifPresent(methodParam -> operation.addParametersItem(new Parameter()
                    .in("header")
                    .name("Authorization")
                    .required(true)
                    .description("인증이 필요한 엔드포인트로, Bearer token을 명시한 Authorization 헤더가 요구됨")
                    .schema(new StringSchema().example("Bearer {token}"))
                ));
            Optional.ofNullable(operation.getParameters())
                .ifPresent(parameters -> parameters.removeIf(
                    param -> param.getName().equals("authorizedEndpointContext")));

            return operation;
        };
    }
}
