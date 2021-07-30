package com.doyoon.openbanking.v0.oauth.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

@Getter
@NoArgsConstructor
public class AutorizeDTO {
    private final String response_type = "code";
    private String client_id;
    private String redirect_uri;
    private String scope;
    private String client_info;
    private String state;
    private String auth_type;
    private String lang;
    private String cellphone_cert_yn;
    private String authorized_cert_yn;
    private String account_hold_yn;
    private String register_info;


    public AutorizeDTO(String client_id, String redirect_uri, String scope, String client_info, String state, String auth_type, String lang, String cellphone_cert_yn, String authorized_cert_yn, String account_hold_yn, String register_info) {
        Assert.hasText(client_id, "client_id must not be empty");
        Assert.hasText(redirect_uri, "redirect_uri must not be empty");
        Assert.hasText(scope, "scope must not be empty");
        Assert.hasText(state, "state must not be empty");
        Assert.hasText(auth_type, "auth_type must not be empty");

        this.client_id = client_id;
        this.redirect_uri = redirect_uri;
        this.scope = scope;
        this.client_info = client_info;
        this.state = state;
        this.auth_type = auth_type;
        this.lang = lang;
        this.cellphone_cert_yn = cellphone_cert_yn;
        this.authorized_cert_yn = authorized_cert_yn;
        this.account_hold_yn = account_hold_yn;
        this.register_info = register_info;
    }
}
