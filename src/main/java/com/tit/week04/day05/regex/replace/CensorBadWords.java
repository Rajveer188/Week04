package com.tit.week04.day05.regex.replace;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;
import static java.lang.System.out;

public class CensorBadWords{
    //method to sensor word
    private static String censorWord(String input, List<String> badWords){
         for(String word : badWords){
             input = input.replaceAll(word, "****");
         }
         return input;
    }

    public static void main(String[] args) {
        //list of bad words
        List<String> badWords = new ArrayList<>();
        badWords.add("damn");
        badWords.add("stupid");

        //censor bad word
        String input = "This is a damn bad example with some stupid words.";
        String output = censorWord(input, badWords);
        //print result
        out.println(output);
    }
}
