package com.doyoon.openbanking.v0.user.login;

import com.doyoon.openbanking.v0.user.UserInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginStatusDTO {
    /*
     0: success sign in
     1: id or pw invalid
     2: return session
     3: expired session
     */

    private int loginStatus;
    private UserInfo userInfo;
}
