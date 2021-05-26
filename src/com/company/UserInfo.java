package com.company;

public class UserInfo {

    /*Variable initialization*/
    private String login;
    private String password;
    private byte numberOfLoginAttempts;
    private static final byte maxNumberOfAttempts = 3;
    private boolean blocking = false;

    public int singUp (String log, String pass){
        if (login.equals("") || password.equals("")){
            return -1;
        } else {
            login = log;
            password = pass;
            return 0;
        }

    }

    public int singIn (String log, String pass){
        if (login.equals("")) {
            return -1;
        } else {
            if (login.equals(log) && password.equals(pass)) {
                reset();
                return 1;
            } else {
                numberOfLoginAttempts++;
                if (numberOfLoginAttempts == maxNumberOfAttempts) {
                    blocked();
                }
                return 0;
            }
        }
    }

    /*Resetting the number of login attempts*/
    public int reset(){
        if (!blocking){
            numberOfLoginAttempts = 0;
            return 0;
        } else {
            return -1;
        }
    }

    public int blocked(){
        if (!blocking) {
            blocking = true;
            return 0;
        } else {
            return -1;
        }
    }
}
