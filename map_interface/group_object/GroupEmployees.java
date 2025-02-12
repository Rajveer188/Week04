package com.tit.week04.day02.map_interface.group_object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupEmployees {
    //method to group employees by department
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        //create map to store employee with department
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            String department = emp.getDepartment();

            if (!departmentMap.containsKey(department)) {
                departmentMap.put(department, new ArrayList<>());
            }
            departmentMap.get(department).add(emp);
        }
        return departmentMap;
    }

    public static void main(String[] args) {
        //create list and add employee
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rajveer", "IT"));
        employees.add(new Employee("Darshan", "IT"));
        employees.add(new Employee("aditya", "HR"));

        //group employees by department
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        //print result
        for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
