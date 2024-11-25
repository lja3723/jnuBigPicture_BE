package kr.ac.jnu.capstone.bigpicture.dongsim._common.swagger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kr.ac.jnu.capstone.bigpicture.dongsim.exception.ErrorCode;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FailApiResponses {

    ErrorCode[] value();
}
