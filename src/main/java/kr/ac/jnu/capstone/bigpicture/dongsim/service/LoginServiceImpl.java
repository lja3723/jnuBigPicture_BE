package kr.ac.jnu.capstone.bigpicture.dongsim.service;

import kr.ac.jnu.capstone.bigpicture.dongsim.dto.request.LoginRequest;
import kr.ac.jnu.capstone.bigpicture.dongsim.dto.response.LoginResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class LoginServiceImpl implements LoginService {

    // TODO: implement
    @Override
    @Transactional(readOnly = true)
    public LoginResponse login(LoginRequest loginRequest) {
        return LoginResponse.builder()
            .isSignupRequest(false)
            .build();
    }

}
