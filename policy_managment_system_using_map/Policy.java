package com.tit.week04.day02.policy_managment_system_using_map;
import java.time.LocalDate;

class Policy{
    //Attribute
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    //constructor
    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "policy number " + policyNumber + ", policyholder " + policyholderName +
                ", expiry " + expiryDate + ", coverage " + coverageType + ", premium " + premiumAmount;
    }
    public String getPolicyNumber() {
        return policyNumber;
    }
    public String getPolicyholderName() {
        return policyholderName;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}