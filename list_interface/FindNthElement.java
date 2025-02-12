package com.tit.week04.day02.list_interface;

import java.util.LinkedList;

import static java.lang.System.out;

//class to find Nth element from last
public class FindNthElement {

    //method to find nth element from last
    public static String findNthFromEnd(LinkedList<String> list, int n){
        if (n > list.size()) {
            return "n is larger than list size";
        }
        //define two pointer
        int fast = 0;
        int slow = 0;

        while (fast < n) {
            fast++;
        }
        while (fast < list.size()) {
            fast++;
            slow++;
        }
        //return nth element
        return list.get(slow);
    }

    public static void main(String[] args) {
        //create a list and add elements
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;

        String charAtN = findNthFromEnd(list, n);
        //print result
        out.println(charAtN);
    }
}
