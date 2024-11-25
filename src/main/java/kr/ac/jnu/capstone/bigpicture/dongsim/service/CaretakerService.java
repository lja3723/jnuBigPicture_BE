package kr.ac.jnu.capstone.bigpicture.dongsim.service;

import kr.ac.jnu.capstone.bigpicture.dongsim._common.auth.AuthorizedEndpointContext;
import kr.ac.jnu.capstone.bigpicture.dongsim.dto.request.CaretakerUpdateRequest;
import kr.ac.jnu.capstone.bigpicture.dongsim.dto.response.CaretakerResponse;

public interface CaretakerService {


    CaretakerResponse getCaretaker(AuthorizedEndpointContext context);
    CaretakerResponse updateCaretaker(AuthorizedEndpointContext context, CaretakerUpdateRequest updateRequest);
}
