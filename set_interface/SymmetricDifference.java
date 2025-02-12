package com.tit.week04.day02.set_interface;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class SymmetricDifference {
    //method to find symmetric difference
    public static Set<Integer> findSymmetricDifference(Set<Integer> setA, Set<Integer> setB) {
        //set to store difference
        Set<Integer> difference = new HashSet<>();

       //add element from setA
        for (Integer element : setA) {
            if (!setB.contains(element)) {
                difference.add(element);
            }
        }
        //add element from setB
        for (Integer element : setB) {
            if (!setA.contains(element)) {
                difference.add(element);
            }
        }
        return difference;
    }

    public static void main(String[] args) {
        //create two sets and store element
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);

        //find difference and print
        Set<Integer> difference = findSymmetricDifference(setA, setB);
        out.println("symmetric difference- " + difference);
    }
}
