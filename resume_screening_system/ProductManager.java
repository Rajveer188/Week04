package com.tit.week04.day01.generics.resume_screening_system;

public class ProductManager extends JobRole{
    //constructor
    public ProductManager(String name) {
        super(name);
    }

    //override method to get job role
    @Override
    public String getJobRole() {
        return "Product Manager";
    }
}
