package com.tit.week04.day04.bank_transaction_system;

import static java.lang.System.out;

public class Account {
    //attribute
    private double balance;
    //constructor
    public Account(double balance) {
        this.balance = balance;
    }
    //method for withdrawing money
    public void withdraw(double amount) throws InsufficientBalanceException,IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        out.println("Withdrawal successful, new balance: " + balance);
    }
}
