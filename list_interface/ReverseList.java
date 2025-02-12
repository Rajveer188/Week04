package com.tit.week04.day02.list_interface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    //constructor
    public ReverseList(){}

    //method to reverse list using array list
    public <T> void reverseList(List<T> list){
        //get length of list
        int length = list.size();
        int first = 0;
        int last = length-1;

        //reverse list
        while (first < last){
            T temp = list.get(first);
            list.set(first,list.get(last));
            list.set(last, temp);
            first++;
            last--;
        }
    }
}
