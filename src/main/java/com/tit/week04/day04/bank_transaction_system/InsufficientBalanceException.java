package com.tit.week04.day04.bank_transaction_system;

import com.tit.week04.day04.custom_exceptions.InvalidAgeException;

public class InsufficientBalanceException extends Exception{
    //constructor
    public InsufficientBalanceException(String message){
        super(message);
    }
}
