package com.tit.week04.day05.junit.advance_junit.testing_bank_transactions;

public class BankAccount {
    //attribute
    private double balance;
    //constructor
    public BankAccount() {}

    //method to deposit amount
    public void deposit(double amount){
        balance += amount;
    }
    //method to deposit amount
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
    }
    //method to get amount
    public double getBalance(){
       return balance;
    }
}
