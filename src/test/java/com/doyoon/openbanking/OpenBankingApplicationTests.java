package com.doyoon.openbanking;

import com.doyoon.openbanking.v0.user.UserController;
import com.doyoon.openbanking.v0.user.UserService;
import com.doyoon.openbanking.v0.user.dto.login.LoginStatusDTO;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    @DisplayName("유저 이름과 함께 로그인 요청이 오면 success status를 보낸다")
    public void givenUsers_whenSignin_thenStatus200() throws Exception{
        LoginStatusDTO status = LoginStatusDTO.builder()
                .loginStatus(0)
                .userInfo(null)
                .build();

        assertAll("LoginStatus",
                () -> assertEquals(0, status.getLoginStatus()),
                () -> assertEquals(null, status.getUserInfo())
        );

    }

    @Test
    void succeedingTest() {
    }

    @Test
    void failingTest() {
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void abortedTest() {
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

    @Configuration
    static class ComponentTestConfig {

        @Bean
        UserService userService() {
            UserService userService = new UserService();
            return userService;
        }
    }

}
