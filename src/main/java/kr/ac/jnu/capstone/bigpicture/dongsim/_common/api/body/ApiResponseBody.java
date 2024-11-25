package kr.ac.jnu.capstone.bigpicture.dongsim._common.api.body;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApiResponseBody<T> extends ResponseBodyBase {

    @Schema(description = "응답 상태", example = "success")
    private final String status;

    @Schema(description = "응답 데이터")
    private final T data;
}
