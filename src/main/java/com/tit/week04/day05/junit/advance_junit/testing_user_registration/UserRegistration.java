package com.tit.week04.day05.junit.advance_junit.testing_user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class UserRegistration{
    //method to validate username
    private static boolean validateUsername(String username){
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
    //method to validate password
    private static boolean validatePassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&*!-])[A-Za-z\\d@#$%^&*!-]{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    //method to validate email
    private static boolean validateEmail(String email){
        //define regex
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        //define pattern
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
    //method to register user
    public boolean registerUser(String username, String email, String password){
        if(!validateUsername(username)){
            out.println("invalid username");
            throw new IllegalArgumentException("invalid username");
        }
        if(!validateEmail(email)){
            out.println("invalid email");
            throw new IllegalArgumentException("invalid email");
        }
        if(!validatePassword(password)){
            out.println("invalid password");
            throw new IllegalArgumentException("invalid password");
        }
        out.println("user registered");
        return true;
    }
}
