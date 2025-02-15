package com.tit.week04.day05.regex.advanced_problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class ValidateSSN {
    //method to validate SSN
    private static void validateSSN(String input){
        //define regex
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        //define pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            out.println(matcher.group() + " is valid");
        }
    }

    public static void main(String[] args) {
        String input = "My SSN is 123-45-6789.";
        //find ssn
        validateSSN(input);
    }
}
