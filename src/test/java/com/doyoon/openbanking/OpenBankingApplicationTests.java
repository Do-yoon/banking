package com.doyoon.openbanking;

import com.doyoon.openbanking.v0.user.dto.login.LoginStatusDTO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class OpenBankingApplicationTests {

    @Autowired
    private MockMvc mvc;

//    @Autowired
//    private UserRepository repository;

    @Test
    public void givenUsers_whenSignin_thenStatus200() throws Exception{
        LoginStatusDTO status = LoginStatusDTO.builder()
                .loginStatus(0)
                .userInfo(null)
                .build();

        mvc.perform(post("/v0/signin")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOK())
                .andExpect(content()
                .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonpath("$[0].loginStatus", is(0)));

    }

}
