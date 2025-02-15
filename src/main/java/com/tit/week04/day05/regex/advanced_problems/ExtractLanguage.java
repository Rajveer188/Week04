package com.tit.week04.day05.regex.advanced_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.out;

public class ExtractLanguage {
    //method to extract and print programming language
    public static void extractProgrammingLanguage(String input, ArrayList<String> programmingLanguages) {
        for(String regex : programmingLanguages){
            //define pattern
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            //print language
            if (matcher.find()) {
                out.print(matcher.group() + ", ");
            }
        }
    }

    public static void main(String[] args) {
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        ArrayList<String> programmingLanguage = new ArrayList<>(List.of("Java", "Python", "JavaScript", "Go", "Ruby"));
        //extract and print language
        extractProgrammingLanguage(input, programmingLanguage);
    }
}
