package com.tit.week04.day05.regex.basic_problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class ValidateHexColor{
    //method to validate a Hex Color Code
    private static void validateHex(String[] colorCodes){
        //define regex
        String regex = "^#[A-Fa-f0-9]{6}";
        //define pattern
        Pattern pattern = Pattern.compile(regex);
        //check colors
        for(String currentCode : colorCodes){
            Matcher matcher = pattern.matcher(currentCode);
            if (matcher.matches()){
                out.println(currentCode + " valid");
            }else{
                out.println(currentCode + " invalid");
            }
        }
    }

    public static void main(String[] args) {
        String[] colorCodes = {"#FFA500", "#ff4500","#123"};
        //validate codes
        validateHex(colorCodes);
    }
}
