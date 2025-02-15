package com.tit.week04.day05.regex.advanced_problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class ValidateCreditCard {
    //method to validate visa card
    public static boolean validateVisaCard(String input) {
        //define regex
        String regex = "^4\\d{15}$";
        //define pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
    public static boolean validateMasterCard(String input) {
        //define regex
        String regex = "^5\\d{15}$";
        //define pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {
        //create object of scanner
        Scanner input = new Scanner(System.in);
        out.print("enter visa card number- ");
        String string = input.nextLine();
        //validate visa card
        if (validateVisaCard(string)) {
            out.println("Valid Visa Card");
        }else {
            out.println("Invalid");
        }

        out.print("enter master card number- ");
        string = input.nextLine();
        if (validateMasterCard(string)) {
            out.println("Valid MasterCard");
        }else {
            out.println("Invalid");
        }
        //close scannner
        input.close();
    }
}
