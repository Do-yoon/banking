package com.doyoon.openbanking.v0.user;

import com.doyoon.openbanking.v0.user.login.LoginDTO;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v0")
@NoArgsConstructor
public class UserController {
    @PostMapping("/login")
    public LoginDTO login() {
        return null;
    }
}
