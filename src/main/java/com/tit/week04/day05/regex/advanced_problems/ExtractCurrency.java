package com.tit.week04.day05.regex.advanced_problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class ExtractCurrency{
    public static void extractCurrencyValues(String input) {
        //define regex
        String regex = "\\$?\\d+\\.\\d";
        //define pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            out.print(matcher.group() + ", ");
        }
    }

    public static void main(String[] args) {
        String input = "The price is $45.99, and the discount is 10.50.";
        //extract values
        extractCurrencyValues(input);
    }
}
