package com.tit.week02.day03.serialization;

import java.util.ArrayList;
import java.util.List;

public class SerializationMain{
    //define file path
    private static String filePath = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\SerializationFile.txt";

    public static void main(String[] args) {
        //create list of employee
        List<Employee> employeeList = new ArrayList<>();
        //create employees
        Employee rajveerEmployee = new Employee("Rajveer", 101, "Cloud", 987654);
        Employee darshanEmployee = new Employee("Darshan", 102, "IT", 987654);

        //add employees to list
        employeeList.add(rajveerEmployee);
        employeeList.add(darshanEmployee);

        //create object of serialization
        SerializationAndDeserialization serialization = new SerializationAndDeserialization();
        //perform serialization on object
        serialization.performSerialization(employeeList, filePath);

        //perform deserialization
        serialization.performDeserialization(filePath);
    }
}
