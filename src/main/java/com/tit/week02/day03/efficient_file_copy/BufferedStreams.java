package com.tit.week02.day03.efficient_file_copy;

import java.io.*;

import static java.lang.System.out;

public class BufferedStreams{
    //method to copy file using buffered streams
    public void copyUsingBufferedStream(String inputFilePath, String outputFilePath){
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputFilePath));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputFilePath))){

            //define buffer size
            int size = 4096;
            byte[] buffer = new byte[size];

            int currentByte;
            while(((currentByte = bufferedInputStream.read(buffer)) != -1)){
                bufferedOutputStream.write(buffer, 0, currentByte);
            }
        } catch (FileNotFoundException e) {
            out.println("file not found");
        } catch (IOException e) {
            out.println("exception while reading file");
        }
    }
    //method to copy file using file streams
    public void copyUsingFileStream(String inputFilePath, String outputFilePath){
        try(FileInputStream fileInputStream = new FileInputStream(inputFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath)){
            //get current byte
            int currentByte;
            while(((currentByte = fileInputStream.read()) != -1)){
                fileOutputStream.write(currentByte);
            }
        } catch (FileNotFoundException e) {
            out.println("file not found");
        } catch (IOException e) {
            out.println("exception while reading file");
        }
    }
}
