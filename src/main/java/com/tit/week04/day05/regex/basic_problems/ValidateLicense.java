package com.tit.week04.day05.regex.basic_problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class ValidateLicense {
    //mathod to validate license
    private static void validateLicense(String[] licenses){
        //define regex
        String regex = "^[A-Z]{2}[0-9]{4}";
        //define pattern
        Pattern pattern = Pattern.compile(regex);

        //check license
        for(String currentLicense : licenses){
            Matcher matcher = pattern.matcher(currentLicense);
            if (matcher.matches()){
                out.println(currentLicense + " valid");
            }else{
                out.println(currentLicense + " invalid");
            }
        }
    }

    public static void main(String[] args) {
        String[] licenses = {"AB1234", "A12345", "12345"};
        //check license
        validateLicense(licenses);
    }
}
