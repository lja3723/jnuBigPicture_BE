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
public class FailApiResponseBody extends ResponseBodyBase {

    @Schema(description = "응답 상태", example = "fail")
    private final String status;

    @Schema(description = "응답 메시지", example = "오류 원인 메시지")
    private final String message;
}
