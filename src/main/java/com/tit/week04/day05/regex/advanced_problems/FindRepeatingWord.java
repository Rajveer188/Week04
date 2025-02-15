package com.tit.week04.day05.regex.advanced_problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class FindRepeatingWord {
    //method to  Find Repeating Words in a Sentence
    private static void repeatingWords(String input){
        //define regex
        String regex = "\\b(\\w+)(\\s+\\1)\\b";
        //define pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            out.print(matcher.group(1) + ", ");
        }
    }

    public static void main(String[] args) {
        String input = "This is is a repeated repeated word test.";
        //find and print repeating words
        repeatingWords(input);
    }
}
