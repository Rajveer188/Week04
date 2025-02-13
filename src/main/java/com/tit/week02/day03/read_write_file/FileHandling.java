package com.tit.week02.day03.read_write_file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;

public class FileHandling {
    public static void main(String[] args) {
        //define input and output file path
        String inputFilePath = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\InputFile.txt";
        String outputFilePath = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\OutputFile.txt";

        try(FileInputStream fileInputStream = new FileInputStream(inputFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath)){
            //get current char
            int currentChar;
            while((currentChar = fileInputStream.read()) != -1){
                //write character to file
                fileOutputStream.write(currentChar);
            }
        } catch (FileNotFoundException e) {
            out.println("file not found");
        } catch (IOException e) {
            out.println("exception while reading file");
        }
    }
}
