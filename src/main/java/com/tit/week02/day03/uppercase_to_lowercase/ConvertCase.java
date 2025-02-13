package com.tit.week02.day03.uppercase_to_lowercase;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ConvertCase{
    //define file path
    private static String inputFilePath = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\UppercaseFile.txt";
    private static String outputFilePath = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\LowercaseFile.txt";

    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader(inputFilePath, UTF_8);
            FileWriter fileWriter = new FileWriter(outputFilePath, UTF_8);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){

            //read file
            String line;
            while((line = bufferedReader.readLine()) != null){
                //convert to lowercase
                String lowerCase = line.toLowerCase();
                //write to file
                bufferedWriter.write(lowerCase);
                bufferedWriter.newLine();
            }
            out.println("file converted successfully");
        } catch (FileNotFoundException e) {
            out.println("file not found");
        } catch (IOException e) {
            out.println("exception while reading file");
        }
    }
}
