package kr.ac.jnu.capstone.bigpicture.dongsim._common.swagger;

import io.swagger.v3.oas.annotations.Parameter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Parameter(description = "인증이 필요한 엔드포인트로, Bearer token을 명시한 Authorization 헤더가 요구됨", required = true, example = "Bearer {token}")
public @interface AuthorizationParameter {

}
