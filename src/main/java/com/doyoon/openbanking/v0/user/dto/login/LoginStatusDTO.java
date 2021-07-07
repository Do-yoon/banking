package com.doyoon.openbanking.v0.user.dto.login;

import com.doyoon.openbanking.v0.user.dao.UserInfo;
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

    @Builder
    public LoginStatusDTO(int loginStatus, UserInfo userInfo) {
        this.loginStatus = loginStatus;
        this.userInfo = userInfo;
    }
}