package com.doyoon.openbanking.v0.user;

import com.doyoon.openbanking.v0.user.dao.LoginInfo;
import com.doyoon.openbanking.v0.user.dao.UserInfo;
import com.doyoon.openbanking.v0.user.dto.login.LoginStatus;
import com.doyoon.openbanking.v0.user.dto.login.LoginStatusDTO;
import com.doyoon.openbanking.v0.user.dto.login.SignInDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Transactional
    public LoginStatusDTO signin(SignInDTO signinDTO) {

        int loginStatus;

        try {
            System.out.println("userRepository: " + userRepository);
            System.out.println(signinDTO.getEmail());
            LoginInfo loginInfo = userRepository.findByEmail(signinDTO.getEmail());
            System.out.println(loginInfo);

            if (loginInfo == null) {
                loginStatus = LoginStatus.ID_INVALID.getValue();
            } else {
                /* wrong password */
                if (signinDTO.getPassword().equals(loginInfo.getPassword()))
                    loginStatus = LoginStatus.PASSWORD_INVALID.getValue();
                else
                    loginStatus = LoginStatus.SUCCESS_TO_SIGN_IN.getValue();
            }
        } catch (Exception e) {
            loginStatus = LoginStatus.FAILED.getValue();
        }

        return LoginStatusDTO.builder()
                .loginStatus(loginStatus)
                .userInfo(null)
                .build();
    }

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
