package kr.ac.jnu.capstone.bigpicture.dongsim.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
@Builder
public class LoginRequest {

    @Schema(description = "소셜 로그인으로 얻은 소셜 ID", example = "92981000192")
    private final String socialId;
}
