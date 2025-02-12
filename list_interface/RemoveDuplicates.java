package com.tit.week04.day02.list_interface;
import java.util.List;
import static java.lang.System.out;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicates{
    //method to remove duplicate from list
    public static List<Integer> removeDuplicate(List<Integer> list){
        //linkedlist to store unique list
        List<Integer> linkedList = new LinkedList<>();
        //hashset to track duplicate element
        Set<Integer> set = new HashSet<>();

        //travers list
        for(int number : list){
            if(!set.contains(number)){
                linkedList.add(number);
            }
            set.add(number);
        }
        return linkedList;
    }

    public static void main(String[] args) {
        //create a list
        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        //print orignal list
        out.println("original list - " + list);
        //remove duplicate
        List<Integer> uniqueList = RemoveDuplicates.removeDuplicate(list);
        out.println("after removing duplicate - " +uniqueList);
    }
}
