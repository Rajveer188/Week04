package com.tit.week02.day03.serialization;

import java.io.Serializable;

//class to represent employee
public class Employee implements Serializable {
    //attribute
    private String name;
    private int id;
    private String department;
    private double salary;

    //constructor to initialize employee
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        String employeeDetails = "name - "+name +
                ", id - "+ id +
                ", department - " + department +
                ", salary - " + salary;
        return employeeDetails;
    }
}
