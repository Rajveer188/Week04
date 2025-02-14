package com.tit.week04.day04.multiple_catch_block;

import java.util.Scanner;

import static java.lang.System.out;

public class ArrayOperation {
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);
        //create an array
        int[] array = null;

        try {
            out.print("enter array size ");
            int size = input.nextInt();
            array = new int[size];

            out.println("enter array elements");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            out.print("enter index to retrieve value ");
            int index = input.nextInt();

            out.println("value at index " + index + "- " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("Invalid index");
        } catch (NullPointerException e) {
            out.println("Array is not initialized");
        }
    }
}
