package com.tit.week04.day02.map_interface;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class FrequencyCounter {
    //method to find word count
    public static Map<String, Integer> countWordFrequency(String filePath){
        //map to store word count
        Map<String, Integer> wordCount = new HashMap<>();

        try{
            //create a file reader
            FileReader fileReader = new FileReader(filePath);
            //create a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");

                //split line into string array
                String[] words = line.split("\\s+");
                //count frequency
                for (String word : words) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            out.println(e.getMessage());
        }
        return wordCount;
    }

    public static void main(String[] args) {
        //define file path
        String filePath = "D:\\Com\\Capgemini_Training\\Collections\\src\\main\\resources\\TextFile.txt";
        Map<String, Integer> wordFrequencies = countWordFrequency(filePath);

        //print result
        out.println(wordFrequencies);
    }
}
