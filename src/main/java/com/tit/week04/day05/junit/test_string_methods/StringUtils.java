package com.tit.week04.day05.junit.test_string_methods;

public class StringUtils {
    //method to reverse a string
    public String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        //reverse string
        stringBuilder.reverse();

        return stringBuilder.toString();
    }
    //method to check palindrome
    public boolean isPalindrome(String str){
        //variable for store left and right index
        int left = 0;
        int right = str.length() - 1;

        //iterator over string
        while (left < right) {
            //check if palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    //method to convert string to uppercase
    public String toUpperCase(String str){
        return str.toUpperCase();
    }
}
