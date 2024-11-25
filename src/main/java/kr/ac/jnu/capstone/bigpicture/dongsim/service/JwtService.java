package kr.ac.jnu.capstone.bigpicture.dongsim.service;

import kr.ac.jnu.capstone.bigpicture.dongsim._common.auth.AuthorizedEndpointContext;

public interface JwtService {

    String getJwtToken(Long id);
    AuthorizedEndpointContext getIdFromJwtToken(String jwtToken);
}
