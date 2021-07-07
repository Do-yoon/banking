package com.doyoon.openbanking.v0.user;

import com.doyoon.openbanking.v0.user.dao.UserInfo;
import com.doyoon.openbanking.v0.user.dto.login.LoginStatusDTO;
import com.doyoon.openbanking.v0.user.dto.login.SigninDTO;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class UserService {
    public LoginStatusDTO signin(SigninDTO signinDTO) {
        System.out.println("good");
        LoginStatusDTO result = LoginStatusDTO.builder()
                .userInfo(null)
                .loginStatus(0)
                .build();
        return result;
    }
}
