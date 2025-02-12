package com.tit.week04.day02.set_interface;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class CompareSet {
    //method to compare sets are equal or not
    public static boolean areEqual(Set<Integer> setA, Set<Integer> setB) {
        //if sizes are different then return false
        if (setA.size() != setB.size()) {
            return false;
        }

        //iterate over set
        for (int element : setA) {
            //check set are equal or not
            if (!setB.contains(element)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //create two sets and add element
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(2);
        setB.add(1);

        boolean result = CompareSet.areEqual(setA, setB);

        out.println(result);
    }
}

