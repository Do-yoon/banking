package com.doyoon.openbanking.v0.user.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class UserInfo {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "email")
    private String email;
}
