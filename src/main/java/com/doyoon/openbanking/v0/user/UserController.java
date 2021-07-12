package com.doyoon.openbanking.v0.user;

import com.doyoon.openbanking.v0.user.dto.login.LoginStatusDTO;
import com.doyoon.openbanking.v0.user.dto.login.SignInDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    private UserService userService;

    @PostMapping("/signin")
    public LoginStatusDTO signin(@RequestBody SignInDTO signinDTO) {
        return userService.signin(signinDTO);
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
