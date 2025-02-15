package com.tit.week04.day05.regex.replace;

import static java.lang.System.out;

public class ReplceSpaces{
    public static void main(String[] args) {
        String input = "This  is        an example   with    multiple spaces.";

        String regex = "\\s+";

        String output = input.replaceAll(regex, " ");

        out.println("original text - " + input +
                "\nafter replacing space - "+ output);
    }
}
