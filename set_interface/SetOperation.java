package com.tit.week04.day02.set_interface;
import static java.lang.System.out;
import java.util.HashSet;
import java.util.Set;

public class SetOperation{
    //method to find union of sets
    public static Set<Integer> findUnion(Set<Integer> setA, Set<Integer> setB) {
        //create set to store union
        Set<Integer> unionSet = new HashSet<>();

        //add setA element to union set
        for (Integer element : setA) {
            unionSet.add(element);
        }
        //add setA element to union set
        for (Integer element : setB) {
            unionSet.add(element);
        }
        //return union set
        return unionSet;
    }
    //method to find intersection of set
    public static Set<Integer> findIntersection(Set<Integer> setA, Set<Integer> setB) {
        //create set to store intersection
        Set<Integer> intersectionSet = new HashSet<>();

       //find intersection element
        for (Integer element : setA) {
            if (setB.contains(element)) {
                intersectionSet.add(element);
            }
        }

        //return result
        return intersectionSet;
    }
    public static void main(String[] args) {
       //create sets and add element
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);

        //find union and intersection
        Set<Integer> unionSet = findUnion(setA, setB);
        Set<Integer> intersectionSet = findIntersection(setA, setB);
        //display result
        out.println("unioun - " + unionSet +
                "\nintersection - " + intersectionSet);

    }
}
