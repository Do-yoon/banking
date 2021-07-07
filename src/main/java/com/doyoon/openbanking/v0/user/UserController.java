package com.doyoon.openbanking.v0.user;

import com.doyoon.openbanking.v0.user.dao.UserInfo;
import com.doyoon.openbanking.v0.user.dto.login.LoginStatusDTO;
import com.doyoon.openbanking.v0.user.dto.login.SigninDTO;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@NoArgsConstructor
@CrossOrigin
public class UserController {
    private UserService userService;

    @PostMapping("/signin")
    public LoginStatusDTO signin(@RequestBody SigninDTO signinDTO) {
        return userService.signin(signinDTO);
    }
}
