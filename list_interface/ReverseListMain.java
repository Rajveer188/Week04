package com.tit.week04.day02.list_interface;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import static java.lang.System.out;

public class ReverseListMain {
    public static void main(String[] args) {
        //create object of Reverse List
        ReverseList reverseListObject = new ReverseList();

        //create an arraylist
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(22);
        arrayList.add(33);
        arrayList.add(44);
        arrayList.add(55);
        //print reversed array list
        out.println("Orignal arraylist - " + arrayList);
        reverseListObject.reverseList(arrayList);
        out.println("reversed arraylist - " + arrayList);

        //create a linkedlist
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);
        linkedList.add(16);
        //print reversed linked list
        out.println("Orignal linkedlist - " + linkedList);
        reverseListObject.reverseList(linkedList);
        out.println("reversed linkedList - " + linkedList);
    }
}
