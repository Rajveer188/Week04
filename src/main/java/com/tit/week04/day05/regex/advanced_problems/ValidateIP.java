package com.tit.week04.day05.regex.advanced_problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.out;

public class ValidateIP {
    public static boolean validateIPAddress(String input) {
        //define regex
        String regex = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)(\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)){3}$";
        //define pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {
        //create scanner class
        Scanner input = new Scanner(System.in);

        out.print("enter a IPV4 address ");
        String ipAddress = input.next();
        if (validateIPAddress(ipAddress)) {
            out.println("Valid");
        } else {
            out.println("Invalid");
        }
        //close scanner
        input.close();
    }
}
