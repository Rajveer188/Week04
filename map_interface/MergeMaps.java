package com.tit.week04.day02.map_interface;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class MergeMaps {
    //method to merge to map
    public static Map<String, Integer> mergeMaps(Map<String, Integer> mapA, Map<String, Integer> mapB) {
        //create new map to store the merged result
        Map<String, Integer> mergedMap = new HashMap<>();

        //add all element of mapA
        for (Map.Entry<String, Integer> entry : mapA.entrySet()) {
            mergedMap.put(entry.getKey(), entry.getValue());
        }

        //add all element of mapB
        for (Map.Entry<String, Integer> entry : mapB.entrySet()) {
            mergedMap.put(entry.getKey(), mergedMap.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
        return mergedMap;
    }

    public static void main(String[] args) {
        //create two map
        Map<String, Integer> mapA = new HashMap<>();
        mapA.put("A", 1);
        mapA.put("B", 2);

        Map<String, Integer> mapB = new HashMap<>();
        mapB.put("B", 3);
        mapB.put("C", 4);

        //merge the maps
        Map<String, Integer> result = mergeMaps(mapA, mapB);

        //print result
        out.println(result);
    }
}
