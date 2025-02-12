package com.tit.week04.day02.map_interface.group_object;

public class Employee {
    //attribute
    private String name;
    private String department;

    //constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
