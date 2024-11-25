package kr.ac.jnu.capstone.bigpicture.dongsim.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public enum ErrorCode {

    AUTHORIZATION_FAILED("header에 Authorization Bearer JWT가 없는 경우", "인증이 필요합니다.", HttpStatus.UNAUTHORIZED),
    ENTITY_NOT_FOUND("엔티티가 존재하지 않은 경우", "존재하지 않는 %s Entity 입니다.", HttpStatus.NOT_FOUND);

    public final String description;
    public final String message;
    public final HttpStatus status;
}
