package kr.ac.jnu.capstone.bigpicture.dongsim._common.api.body;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@JsonNaming(SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FailApiResponseBody extends ResponseBodyBase {

    private final String message;
}
