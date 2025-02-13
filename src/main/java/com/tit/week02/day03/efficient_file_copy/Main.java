package com.tit.week02.day03.efficient_file_copy;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        BufferedStreams bufferedStreams = new BufferedStreams();
        //define file path
        String inputFilePath = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\InputFile.txt";
        String outputFileBuffered = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\BufferedStreamOutput.txt";
        String outputFileStream = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\FileStreamOutput.txt";

        long startTime = System.nanoTime();
        bufferedStreams.copyUsingBufferedStream(inputFilePath, outputFileBuffered);
        long endTime = System.nanoTime();
        long totalTime = endTime-startTime;
        out.println("time taken by buffered stream in ms - " + totalTime/1e6);

        startTime = System.nanoTime();
        bufferedStreams.copyUsingFileStream(inputFilePath, outputFileStream);
        endTime = System.nanoTime();
        totalTime = endTime-startTime;
        out.println("time taken by file stream in ms - " + totalTime/1e6);
    }
}
