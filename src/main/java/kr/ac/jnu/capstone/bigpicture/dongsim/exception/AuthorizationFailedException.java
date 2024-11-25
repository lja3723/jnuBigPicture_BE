package kr.ac.jnu.capstone.bigpicture.dongsim.exception;

public class AuthorizationFailedException extends BusinessException {

    public AuthorizationFailedException() {
        super(ErrorCode.AUTHORIZATION_FAILED);
    }
}
