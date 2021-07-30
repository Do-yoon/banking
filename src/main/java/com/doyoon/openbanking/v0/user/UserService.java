package com.doyoon.openbanking.v0.user;

import com.doyoon.openbanking.v0.user.dao.LoginInfo;
import com.doyoon.openbanking.v0.user.dto.login.LoginStatusDTO;
import com.doyoon.openbanking.v0.user.dto.login.SignInDTO;
import com.doyoon.openbanking.v0.user.status.LoginStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Transactional
    public LoginStatusDTO signin(SignInDTO signinDTO) {

        int loginStatus;
        LoginStatusDTO res = LoginStatusDTO.builder()
                .userInfo(null)
                .build();

        try {
            System.out.println("userRepository: " + userRepository);
            String email = signinDTO.getEmail();
            LoginInfo loginInfo = userRepository.findByEmail(email);

            /* email validation */
            if (loginInfo == null) {
                res.setLoginStatus(LoginStatus.ID_INVALID.getValue());
                return res;
            }

            /* password validation */
            boolean isValidPassword = signinDTO.getPassword().equals(loginInfo.getPassword());

            if (!isValidPassword) {
                res.setLoginStatus(LoginStatus.PASSWORD_INVALID.getValue());
                return res;
            }

            /* OAuth validation */
            if (OAuthValidation(email)) {
                res.setLoginStatus(LoginStatus.SUCCESS_TO_SIGN_IN.getValue());
            }

        } catch (Exception e) {
            res.setLoginStatus(LoginStatus.FAILED.getValue());
        }
        return res;

    }

    private boolean OAuthValidation(String id) {
        return true;
    }


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
