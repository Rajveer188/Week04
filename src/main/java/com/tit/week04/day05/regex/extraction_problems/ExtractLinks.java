package com.tit.week04.day05.regex.extraction_problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.out;

public class ExtractLinks {
    public static void extractLinks(String input) {
        //define regex
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-z]{2,}";
        //define patten
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        String input = "Visit https://www.google.com and http://example.org for more info.";
        //extract and print links
        extractLinks(input);
    }
}
