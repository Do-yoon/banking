package com.doyoon.openbanking;

import com.doyoon.openbanking.v0.user.UserService;
import com.doyoon.openbanking.v0.user.dto.login.SignInDTO;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.aspectj.bridge.MessageUtil.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig
class OpenBankingApplicationTests {
    //    @Autowired
    //    private UserRepository repository;

    @Autowired
    UserService userService;

    @Test
    @DisplayName("유저 이름과 함께 로그인 요청이 오면 success status를 보낸다")
    public void givenUsers_whenSignIn_thenStatus200() throws Exception{
        SignInDTO signinDTO = SignInDTO.builder()
                .email("id")
                .password("pw")
                .build();

        assertEquals(0, userService.signin(signinDTO).getLoginStatus());

    }

    public OpenBankingApplicationTests(UserService userService) {
        this.userService = userService;
    }

}
