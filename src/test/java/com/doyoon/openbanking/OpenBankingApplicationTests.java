package com.doyoon.openbanking;

import com.doyoon.openbanking.v0.user.UserController;
import com.doyoon.openbanking.v0.user.dto.login.LoginStatusDTO;
import org.junit.jupiter.api.*;

import static org.aspectj.bridge.MessageUtil.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class OpenBankingApplicationTests {
    //    @Autowired
    //    private UserRepository repository;
    private final UserController userController = new UserController();

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

        assertEquals(status, userController.signin(null), "failed");

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
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }




}
