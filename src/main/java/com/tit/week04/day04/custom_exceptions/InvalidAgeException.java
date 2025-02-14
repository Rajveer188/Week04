package com.tit.week04.day04.custom_exceptions;

public class InvalidAgeException extends Exception{
    //constructor
    public InvalidAgeException(String message){
        super(message);
    }
}
