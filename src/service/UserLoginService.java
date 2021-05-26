package service;

import com.company.UserInfo;

public class UserLoginService {
    private final UserInfo user;
/*
    public int singUp (String login, String password){
        if (login.equals("") || password.equals("")){
            return -1;
        } else {
            user.login = login;
            user.password = password;
            return 0;
        }

    }

    public int singIn (String login, String password){
        if (user.login.equals("")) {
            return -1;
        } else {
            if (user.login.equals(login) && user.password.equals(password)) {
                user.reset();
                return 1;
            } else {
                user.numberOfLoginAttempts++;
                if (user.numberOfLoginAttempts == 3) {
                    user.blocked();
                }
                return 0;
            }
        }
    }*/

    public UserLoginService(UserInfo user) {
        this.user = user;
    }
}
