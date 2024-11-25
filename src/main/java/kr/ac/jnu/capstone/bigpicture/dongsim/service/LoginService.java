package kr.ac.jnu.capstone.bigpicture.dongsim.service;

import kr.ac.jnu.capstone.bigpicture.dongsim.dto.request.LoginRequest;
import kr.ac.jnu.capstone.bigpicture.dongsim.dto.response.LoginResponse;

public interface LoginService {

    LoginResponse login(LoginRequest loginRequest);
}
