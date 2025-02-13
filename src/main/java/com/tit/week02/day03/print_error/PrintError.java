package com.tit.week02.day03.print_error;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class PrintError{
    //define file path
    private static String inputFilePath = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\LargeFile.txt";

    //main method
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader(inputFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){

            //get current line
            String line;
            while((line = bufferedReader.readLine()) != null){
                //convert line to string array and then list
                line = line.replaceAll("[^a-zA-Z0-9 ]", "");
                String[] stringArray = line.split(" ");
                List<String> list = new ArrayList<>(List.of(stringArray));
                //check if line contain error
                if(list.contains("error")){
                    out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            out.println("file not found");
        } catch (IOException e) {
            out.println("exception while reading file");
        }
    }
}
