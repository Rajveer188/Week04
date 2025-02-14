package com.tit.week04.day04.custom_exceptions;

import java.util.Scanner;

import static java.lang.System.out;

public class ValidateAge {
    //method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age >= 18) {
            out.println("Access granted");
            return;
        }
        //throw exception
        throw new InvalidAgeException("Age must be 18 or older");
    }

    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);
        //take iput
        out.println("enter age - ");
        int age = input.nextInt();
        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            out.println(e.getMessage());
        }
    }
}
