package com.tit.week04.day02.policy_managment_system_using_map;
import java.time.LocalDate;
import java.util.*;

import static java.lang.System.out;


public class PolicyManagementSystem {
    private HashMap<String, Policy> policyMap = new HashMap<>();
    private LinkedHashMap<String, Policy> orderedPolicies = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> sortedByExpiry = new TreeMap<>();

    // method to add a policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicies.put(policy.getPolicyNumber(), policy);

        if (!sortedByExpiry.containsKey(policy.getExpiryDate())) {
            sortedByExpiry.put(policy.getExpiryDate(), new ArrayList<>());
        }
        sortedByExpiry.get(policy.getExpiryDate()).add(policy);
    }

    //method to retrieve policy by number
    public void getPolicyByNumber(String policyNumber) {
        out.println("\npolicy " + policyNumber +
                   "\n"+policyMap.get(policyNumber));
    }

    //method to print all policies expiring soon
    public void listExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate expiringDate = today.plusDays(30);

        out.println("\npolicies expiring in 30 days");
        for (Map.Entry<LocalDate, List<Policy>> entry : sortedByExpiry.entrySet()) {
            if (!entry.getKey().isAfter(expiringDate)) {
                for (Policy policy : entry.getValue()) {
                    out.println(policy);
                }
            }
        }
    }

    // method to print all policies
    public void policiesByName(String policyholder) {
        out.println("\npolicie  " + policyholder);
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyholderName().equals(policyholder)) {
                out.println(policy);
            }
        }
    }

    //method to remove expired policie
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        out.println("\nremove expired policies");
        Iterator<Map.Entry<LocalDate, List<Policy>>> iterator = sortedByExpiry.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<LocalDate, List<Policy>> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                for (Policy policy : entry.getValue()) {
                    out.println("removing " + policy);
                    policyMap.remove(policy.getPolicyNumber());
                    orderedPolicies.remove(policy.getPolicyNumber());
                }
                iterator.remove();
            }
        }
    }
}
