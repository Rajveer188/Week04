package com.tit.week04.day02.list_interface;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class RotateList {
    //method to rotate list
    public static void rotateList(List<Integer> list, int rotationPoint) {
        //get length of list
        int length = list.size();

        //rotate list
        for (int i = 0; i < rotationPoint; i++) {
            int first = list.remove(0);
            list.add(first);
        }
    }

    public static void main(String[] args) {
        //create a list
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //define rotation point
        int rotationPoint = 2;
        //print list
        out.println("Original list - " + list);
        //rotate list
        RotateList.rotateList(list, rotationPoint);

        out.println("rotated list - " + list);
    }
}
