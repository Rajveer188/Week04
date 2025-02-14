package com.tit.week04.day04.unchecked_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class Division {
    public static void main(String[] args) {
        //create scanner object
        Scanner scanner = new Scanner(System.in);

        try {
            out.print("enter numerator ");
            int numerator = scanner.nextInt();
            out.print("enter the denominator ");
            int denominator = scanner.nextInt();

            double result = numerator / denominator;
            out.println("result- " + result);

        } catch (ArithmeticException e) {
            out.println("number can not be divisible by 0");
        } catch (InputMismatchException e) {
            out.println("invalid input, enter numeric values");
        }
    }
}
