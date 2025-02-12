package com.tit.week04.day02.policy_managment_using_set;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class PolicyManagementSystem {
    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("\nAll Policies");
        for (Policy policy : hashSetPolicies) {
            System.out.println(policy);
        }
    }

    public void displayExpiringSoon() {
        LocalDate today = LocalDate.now();
        System.out.println("\nPolicies Expiring Soon");
        for (Policy policy : treeSetPolicies) {
            long daysBetween = today.until(policy.getExpiryDate(), ChronoUnit.DAYS);
            if (daysBetween <= 30) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String coverageType) {
        System.out.println("\nPolicies with Coverage Type " + coverageType);
        for (Policy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    public void findDuplicatePolicies() {
        Set<String> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies");
        for (Policy policy : linkedHashSetPolicies) {
            if (!seen.add(policy.getPolicyNumber())) {
                System.out.println(policy);
            }
        }
    }

    public void comparePerformance() {
        int numPolicies = 10000;
        List<Policy> policyList = new ArrayList<>();
        for (int i = 0; i < numPolicies; i++) {
            policyList.add(new Policy("P" + i, "Holder" + i, LocalDate.now().plusDays(i % 365), "Health", 5000 + (i % 1000)));
        }

        measurePerformance("HashSet", new HashSet<>(), policyList);
        measurePerformance("LinkedHashSet", new LinkedHashSet<>(), policyList);
        measurePerformance("TreeSet", new TreeSet<>(), policyList);
    }

    private void measurePerformance(String setType, Set<Policy> set, List<Policy> policies) {
        long startTime, endTime;

        startTime = System.nanoTime();
        set.addAll(policies);
        endTime = System.nanoTime();
        System.out.println(setType + " - Add Time " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        endTime = System.nanoTime();
        System.out.println(setType + " - Search Time " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        set.remove(policies.get(5000));
        endTime = System.nanoTime();
        System.out.println(setType + " - remove Time " + (endTime - startTime) + " ns");
    }
}
