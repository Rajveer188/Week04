package com.tit.week02.day03.count_words;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;

public class WordCounter {
    //define file path
    private static String filePath = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\InputFile.txt";
    //method to count word
    private static Map<String, Integer> countWord(String filePath){
        //map to store word and count
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                //count word
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            out.println("Error while reading file");
        }
        return wordCountMap;
    }
    //method to display top words
    private static void displayTopWords(Map<String, Integer> wordCountMap) {
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
        //sort list
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        out.println("top 5 word - ");
        for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
            out.println(sortedWords.get(i).getKey() +" " + sortedWords.get(i).getValue());
        }
    }

    public static void main(String[] args) {
        //get word count
        Map<String, Integer> wordCountMap = countWord(filePath);
        //display top words
        displayTopWords(wordCountMap);

    }
}