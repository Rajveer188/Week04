package com.tit.week04.day05.junit.list_operations;

import java.util.ArrayList;
import java.util.List;

public class ListManager{
    //method to add element
    public void addElement(List<Integer> list, int element){
        list.add(element);
    }
    //method to remove element
    public boolean removeElement(List<Integer> list, int element){
        return list.remove((Integer)element);
    }
    //method to get size
    public int getSize(List<Integer> list){
        return list.size();
    }
}
