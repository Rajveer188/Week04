package com.tit.week04.day02.banking_system;

import java.util.*;

import static java.lang.System.out;

public class BankingSystem {
    //attributes
    private Map<String, Double> accounts = new HashMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    //method to add account
    public void addAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }
    //method to request for withdrawal
    public void requestWithdrawal(String accountNumber) {
        if (accounts.containsKey(accountNumber)){
            withdrawalQueue.add(accountNumber);
        }
    }
    //method to process withdrawal
    public void processWithdrawals() {
        out.println("\nprocessing withdrawals - ");
        while (!withdrawalQueue.isEmpty()) {
            out.println("processing withdrawal for " + withdrawalQueue.poll());
        }
    }
    public void displayAccounts() {
        TreeMap<Double, String> sortedAccounts = new TreeMap<>(Collections.reverseOrder());

        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }

        //print sorted accounts
        out.println("\nsorted account by balance - ");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            System.out.println("account- " + entry.getValue() + ", balance- " + entry.getKey());
        }
    }

    public static void main(String[] args) {
        //create object of banking syste
        BankingSystem bank = new BankingSystem();
        //add accounts
        bank.addAccount("1234", 5000);
        bank.addAccount("4567", 3000);
        bank.addAccount("7890", 7000);

        //request for withdrawal
        bank.requestWithdrawal("4567");
        bank.requestWithdrawal("7890");
        //process widthrawal
        bank.processWithdrawals();
        //display account
        bank.displayAccounts();
    }
}
