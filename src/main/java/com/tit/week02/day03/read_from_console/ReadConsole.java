package com.tit.week02.day03.read_from_console;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.InputStreamReader;

import static java.lang.System.*;

public class ReadConsole {
    public static void main(String[] args) {
        //define file path
        String filePath = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\UserData.txt";
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileWriter fileWriter = new FileWriter(filePath, true)){

            String input;
            //get name and print
            out.println("Enter name -");
            input = bufferedReader.readLine();
            fileWriter.write("\nname - " + input);

            //get age and write
            out.println("Enter age -");
            input = bufferedReader.readLine();
            fileWriter.write("\nage - " + input);
            //get favorite language and write
            out.println("Enter favorite language name -");
            input = bufferedReader.readLine();
            fileWriter.write("\nfavorite language - " + input+"\n");

            out.println("data stored to file");
        } catch (IOException e) {
            out.println("exception while writing file");
        }
    }
}