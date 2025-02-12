package com.tit.week04.day02.list_interface;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;
import java.util.Map;
import java.util.HashMap;

public class FindFrequency{
    //method to find frequency
    public static Map<String, Integer> findFrequency(List<String> list){
        //create hashmap to store frequency
        Map<String, Integer> map = new HashMap<>();

        for(String currentString : list){
            //get current frequency
            int frequency = map.getOrDefault(currentString,0);
            //update frequency
            frequency++;
            map.put(currentString, frequency);
        }
        return map;
    }

    public static void main(String[] args) {
        //create a list and add items
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        //print list
        out.println(list);
        Map<String, Integer> frequencyMap = findFrequency(list);
        //print frequency of list
        out.println(frequencyMap);
    }
}
