package com.tit.week04.day04.exception_propagation;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class InterestCalculator{
    //method to calculate interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        double interest = (amount * rate * years) / 100;
        return interest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            //take input
            out.print("enter amount ");
            double amount = input.nextDouble();
            out.print("enter rate ");
            double rate = input.nextDouble();
            out.print("enter years ");
            int years = input.nextInt();

            //calculate interest
            double interest = calculateInterest(amount, rate, years);
            out.println("interest " + interest);

        } catch (IllegalArgumentException e) {
            out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
