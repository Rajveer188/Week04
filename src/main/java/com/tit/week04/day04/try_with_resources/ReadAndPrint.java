package com.tit.week04.day04.try_with_resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

public class ReadAndPrint{
    public static void main(String[] args) {
        //define file path
        String filePath = "D:\\Com\\Capgemini_Training\\Exceptions\\src\\main\\resources\\info.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            //read first line
            String line = reader.readLine();
            //print first line
            out.println(line);
        }catch (IOException e) {
            out.println("Error reading file");
        }
    }
}
