package com.tit.week04.day01.generics.resume_screening_system;

public class SoftwareEngineer extends JobRole{

    //constructor
    public SoftwareEngineer(String name) {
        super(name);
    }
    //override method to get job role
    @Override
    public String getJobRole() {
        return "Software Engineer";
    }
}
