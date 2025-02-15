package com.tit.week04.day05.regex.extraction_problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class ExtractEmails {
    //method to Extract All Email Addresses from a Text
    private static void extractEmail(String string){
        //define regex
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        //define pattern
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(string);

        while(matcher.find()){
            out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        String string = "Contact us at support@example.com and info@company.org";
        //extract all emails
        extractEmail(string);
    }
}
