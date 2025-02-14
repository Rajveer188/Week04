package com.tit.week04.day04.finally_block;

import java.util.Scanner;

import static java.lang.System.out;

public class IntegerDivision {
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);

        //take input
        out.print("enter numerator ");
        int numerator = input.nextInt();
        out.print("enter denominator ");
        int denominator = input.nextInt();

        try {
            //divide and print result
            int result = numerator / denominator;
            out.println("result " + result);
        } catch (ArithmeticException e) {
            out.println("division by zero is not allowed");
        } finally {
            out.println("Operation completed");
            input.close();
        }
    }
}


