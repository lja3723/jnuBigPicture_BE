package kr.ac.jnu.capstone.bigpicture.dongsim.exception;

public class EntityNotFoundException extends BusinessException {

    public <T> EntityNotFoundException(Class<T> classType) {
        super(ErrorCode.ENTITY_NOT_FOUND,
            String.format(ErrorCode.ENTITY_NOT_FOUND.message, classType.getSimpleName()));
    }

}
