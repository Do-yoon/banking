package com.doyoon.openbanking.v0.user;

import com.doyoon.openbanking.v0.user.login.LoginStatusDTO;
import com.doyoon.openbanking.v0.user.login.SigninDTO;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@NoArgsConstructor
public class UserController {
    @PostMapping("/signin")
    public LoginStatusDTO login(@RequestBody SigninDTO signinDTO) {
        LoginStatusDTO result = new LoginStatusDTO();
        result.setLoginStatus(0);
        return result;
    }
}
