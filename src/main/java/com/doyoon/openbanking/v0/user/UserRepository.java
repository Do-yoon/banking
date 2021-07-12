package com.doyoon.openbanking.v0.user;

import com.doyoon.openbanking.v0.user.dao.LoginInfo;
import com.doyoon.openbanking.v0.user.dao.UserInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends CrudRepository<LoginInfo, Long> {
    @Query("select u from LoginInfo u where u.email = ?1")
    LoginInfo findByEmail(String email);

    @Query("select u from UserInfo u where u.userName = ?1")
    UserInfo findByUserName(String userName);
}