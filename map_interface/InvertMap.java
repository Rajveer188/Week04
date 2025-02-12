package com.tit.week04.day02.map_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;

public class InvertMap {
    //method to invert map
    public static Map<Integer, List<String>> invertMap(Map<String, Integer> originalMap) {
        // Create a map to store inverted map
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        //iterate over the original map
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            //check if value already exists or not
            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }
            invertedMap.get(value).add(key);
        }
        return invertedMap;
    }

    public static void main(String[] args) {
        //create a map and add value
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        //invert the map
        Map<Integer, List<String>> invertedMap = invertMap(originalMap);

        //print result
        out.println("original - " + originalMap +
                "\ninverted - " +invertedMap);
    }
}
