package com.doyoon.openbanking;

import com.doyoon.openbanking.v0.OpenBankingApplication;
import com.doyoon.openbanking.v0.user.UserService;
import com.doyoon.openbanking.v0.user.dto.login.SignInDTO;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = OpenBankingApplication.class)
class OpenBankingApplicationTests {
    //    @Autowired
    //    private UserRepository repository;

    @Autowired
    private UserService userService;

    @Test
    @DisplayName("유저 이름과 함께 로그인 요청이 오면 success status를 보낸다")
    public void givenUsers_whenSignIn_thenStatus200() throws Exception{
        SignInDTO signinDTO = SignInDTO.builder()
                .email("id")
                .password("pw")
                .build();

        assertEquals(0, userService.signin(signinDTO).getLoginStatus());

    }

}
