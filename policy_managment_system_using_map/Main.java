package com.tit.week04.day02.policy_managment_system_using_map;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PolicyManagementSystem policyManagementSystem = new PolicyManagementSystem();

        policyManagementSystem.addPolicy(new Policy("P001", "Rajveer", LocalDate.now().plusDays(10), "Health", 5000));
        policyManagementSystem.addPolicy(new Policy("P002", "Darshan", LocalDate.now().plusDays(40), "Auto", 3000));
        policyManagementSystem.addPolicy(new Policy("P003", "Rajveer", LocalDate.now().plusDays(5), "Home", 7000));
        policyManagementSystem.addPolicy(new Policy("P004", "Ankit", LocalDate.now().minusDays(2), "Health", 6000));

        policyManagementSystem.getPolicyByNumber("P001");
        policyManagementSystem.listExpiringSoon();
        policyManagementSystem.policiesByName("Rajveer");
        policyManagementSystem.removeExpiredPolicies();
    }
}
