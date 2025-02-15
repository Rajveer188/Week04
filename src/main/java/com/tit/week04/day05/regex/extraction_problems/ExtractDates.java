package com.tit.week04.day05.regex.extraction_problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.out;

public class ExtractDates {
    //method to Extract Dates in dd/mm/yyyy Format
    private static void extractDate(String input){
        //define regex
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        //define patter
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        //print all dates
        while (matcher.find()){
            out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        String input = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        //extract all dates
        extractDate(input);
    }
}
