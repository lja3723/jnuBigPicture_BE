package kr.ac.jnu.capstone.bigpicture.dongsim.service;

import kr.ac.jnu.capstone.bigpicture.dongsim._common.auth.AuthorizedEndpointContext;
import org.springframework.stereotype.Service;

@Service
public class JwtServiceImpl implements JwtService {

    // TODO: implement
    @Override
    public String getJwtToken(Long id) {
        return String.valueOf(id);
    }

    // TODO: implement
    @Override
    public AuthorizedEndpointContext getIdFromJwtToken(String jwtToken) {
        return new AuthorizedEndpointContext(Long.parseLong(jwtToken));
    }
}
