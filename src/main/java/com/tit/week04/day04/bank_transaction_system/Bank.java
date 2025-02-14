package com.tit.week04.day04.bank_transaction_system;

import static java.lang.System.out;

public class Bank {
    public static void main(String[] args) {
        //create object of account
        Account account = new Account(7000);

        try {
            //withdraw amount
            account.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            out.println(e.getMessage());
        }
    }
}
