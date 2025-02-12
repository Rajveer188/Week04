package com.tit.week04.day02.set_interface;

import java.util.HashSet;
import java.util.Set;

public class FindSubsets {
    //method to find if set is subset or not
    public static boolean isSubset(Set<Integer> setA, Set<Integer> setB) {
        //check if every element in setA is present in setB
        for (Integer element : setA) {
            if (!setB.contains(element)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //create two set and add element
        Set<Integer> setA = new HashSet<>();
        setA.add(2);
        setA.add(3);

        Set<Integer> setB = new HashSet<>();
        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);

        //check for subset
        boolean result = isSubset(setA, setB);
        System.out.println(result);
    }
}
