package kr.ac.jnu.capstone.bigpicture.dongsim.dto.response;

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
public class LoginResponse {

    @Schema(description = "로그인 시도가 회원가입인지 여부", example = "false")
    private final Boolean isSignupRequest;

    @Schema(description = "JWT 토큰", example = "10us89q871243tiuaweaiuytfsd7166617u")
    private final String token;
}
