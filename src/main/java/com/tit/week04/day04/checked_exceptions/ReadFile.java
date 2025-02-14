package com.tit.week04.day04.checked_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

public class ReadFile {
    public static void main(String[] args) {
        //define file path
        String filePath = "data.txt";

        try{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            //read file line by line
            while ((line = reader.readLine()) != null) {
                out.println(line);
            }
            //close resources
            reader.close();
        }catch (IOException e) { //handle exception
            out.println("File not found");
        }

    }
}
