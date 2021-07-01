package com.doyoon.openbanking.v0.user.login;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginStatusDTO {
    /*
     0: success sign in
     1: id or pw invalid
     2: return session
     3: expired session
     */

    private int loginStatus;
    // private UserInfo userInfo
}
