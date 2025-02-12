package com.tit.week04.day02.policy_managment_using_set;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PolicyManagementSystem  policyManagementSystem= new PolicyManagementSystem();

        policyManagementSystem.addPolicy(new Policy("P001", "Rajveer", LocalDate.now().plusDays(10), "Health", 5000));
        policyManagementSystem.addPolicy(new Policy("P002", "Darshan", LocalDate.now().plusDays(40), "Auto", 6000));
        policyManagementSystem.addPolicy(new Policy("P003", "Ankit", LocalDate.now().plusDays(20), "Home", 5500));
        policyManagementSystem.addPolicy(new Policy("P004", "Aditya", LocalDate.now().plusDays(5), "Health", 5200));
        policyManagementSystem.addPolicy(new Policy("P001", "Rajveer", LocalDate.now().plusDays(10), "Health", 5000));

        policyManagementSystem.displayAllPolicies();
        policyManagementSystem.displayExpiringSoon();
        policyManagementSystem.displayByCoverageType("Health");
        policyManagementSystem.findDuplicatePolicies();

        System.out.println("\nPerformance Comparison:");
        policyManagementSystem.comparePerformance();
    }
}
