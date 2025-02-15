package com.tit.week04.day05.junit.advance_junit.testing_password_strength;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class PasswordValidator {
    public boolean validatePassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
