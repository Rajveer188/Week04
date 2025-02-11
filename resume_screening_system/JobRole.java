package com.tit.week04.day01.generics.resume_screening_system;

public abstract class JobRole {
    //Attribute
    private String name;

    //constructor
    public JobRole(String name){
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }
    //abstract method to get job role
    public abstract String getJobRole();
}
