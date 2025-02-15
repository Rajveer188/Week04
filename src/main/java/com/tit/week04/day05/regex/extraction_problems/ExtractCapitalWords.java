package com.tit.week04.day05.regex.extraction_problems;
import static java.lang.System.out;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWords {
    //method to extract capital words
    public static void extractCapitalizedWords(String input) {
        //define regex
        String regex = "\\b[A-Z][a-z]*\\b";
        //define pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            out.print(matcher.group() + ", ");
        }
    }

    public static void main(String[] args) {
        String input ="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        //extract and print capital word
        extractCapitalizedWords(input);
    }

}
