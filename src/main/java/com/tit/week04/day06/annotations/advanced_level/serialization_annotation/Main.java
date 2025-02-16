package com.tit.week04.day06.annotations.advanced_level.serialization_annotation;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        //create a user
        User rajveerUser = new User("Rajveer", 101);
        //convert to json string
        String jsonString = JsonSerializer.serialize(rajveerUser);
        //print
        out.println(jsonString);
    }
}
