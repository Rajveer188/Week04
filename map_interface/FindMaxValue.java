package com.tit.week04.day02.map_interface;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class FindMaxValue {
    //method to find the key with maximum value
    public static String findMaxKey(Map<String, Integer> map) {
        //declare variable to store max key and value
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        //iterate map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        //create a map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        //find key
        String result = findMaxKey(map);

        //print result
        out.println(result);
    }
}
