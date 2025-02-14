package com.tit.week04.day04.nested_try_catch;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take array as input
        out.println("enter size of array");
        int size = input.nextInt();
        out.print("enter array element ");
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }

        out.print("enter  index of element ");
        int index = input.nextInt();
        out.print("enter divisor ");
        int divisor = input.nextInt();

        try {
            int element = array[index];
            try {
                int result = element / divisor;
                out.println("result " + result);
            } catch (ArithmeticException e) {
                out.println("Cannot divide by zero");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("Invalid array index");
        }
    }
}
