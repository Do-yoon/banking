package com.doyoon.openbanking.v0.user;

import com.doyoon.openbanking.v0.user.dto.login.LoginStatusDTO;
import com.doyoon.openbanking.v0.user.dto.login.SigninDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    //private final UserRepository userRepository;

    @Transactional
    public LoginStatusDTO signin(SigninDTO signinDTO) {
        System.out.println("good");
        LoginStatusDTO result = LoginStatusDTO.builder()
                .userInfo(null)
                .loginStatus(0)
                .build();
        return result;
    }
}
