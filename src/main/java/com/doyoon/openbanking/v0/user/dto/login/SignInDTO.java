package com.doyoon.openbanking.v0.user.dto.login;

import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SignInDTO {
    private String email;
    private String password;
}
