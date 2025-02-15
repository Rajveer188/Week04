package com.tit.week04.day05.regex.basic_problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class ValidateUsername{
    private static void validateUsername(String[] username){
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,15}";
        Pattern pattern = Pattern.compile(regex);
        for(String currentUser : username){
            Matcher matcher = pattern.matcher(currentUser);
            out.println(currentUser + ", valid - " +matcher.matches());
        }
    }

    public static void main(String[] args) {
        String[] usernames = {"user_123", "123user", "us"};

        validateUsername(usernames);
    }
}
