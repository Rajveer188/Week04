package com.tit.week04.day01.generics.resume_screening_system;

public class DataScientist extends JobRole{
    //constructor
    public DataScientist(String name) {
        super(name);
    }

    //override method to get job role
    @Override
    public String getJobRole() {
        return "Data Scientist";
    }
}
