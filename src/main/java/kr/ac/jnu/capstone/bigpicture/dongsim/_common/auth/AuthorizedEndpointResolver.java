package kr.ac.jnu.capstone.bigpicture.dongsim._common.auth;

import java.util.Objects;
import kr.ac.jnu.capstone.bigpicture.dongsim.exception.AuthorizationFailedException;
import kr.ac.jnu.capstone.bigpicture.dongsim.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
@RequiredArgsConstructor
public class AuthorizedEndpointResolver implements HandlerMethodArgumentResolver {

    private final JwtService jwtService;

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(AuthorizedEndpoint.class) &&
            parameter.getParameterType().equals(AuthorizedEndpointContext.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter,
        ModelAndViewContainer mavContainer,
        NativeWebRequest webRequest,
        WebDataBinderFactory binderFactory) throws Exception
    {

        String bearerToken = webRequest.getHeader("Authorization");
        if (Objects.isNull(bearerToken)) {
            throw new AuthorizationFailedException();
        }

        return jwtService.getIdFromJwtToken(bearerToken);
    }
}
