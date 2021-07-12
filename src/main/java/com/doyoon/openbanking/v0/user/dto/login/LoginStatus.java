package com.doyoon.openbanking.v0.user.dto.login;

import lombok.Getter;
import lombok.val;

@Getter
public enum LoginStatus {
    SUCCESS_TO_SIGN_IN(0),
    FAILED(1),
    ID_INVALID(2),
    PASSWORD_INVALID(3),
    RETURN_SESSION(4),
    EXPIRED_SESSION(5);

    private int value;
    private LoginStatus(int value) {
        this.value = value;
    }
}
