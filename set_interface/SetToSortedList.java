package com.tit.week04.day02.set_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class SetToSortedList {
    //method to swap
    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    //method to convert set to sorted list
    public static List<Integer> convertSetToList(Set<Integer> set) {
        //convert set to list
        List<Integer> list = new ArrayList<>(set);

        //sort list
        int length= list.size();
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                   swap(list, j, j + 1);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        //create set and add values
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);
        //convert to list
        List<Integer> sortedList = convertSetToList(set);

        // print sorted list
        out.println("sorted List - " + sortedList);
    }
}
