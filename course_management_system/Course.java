package com.tit.week04.day01.generics.course_management_system;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Course <T extends CourseType>{
    //Attribute
    private List<T> courseList;
    //constructor
    public Course(){
        this.courseList = new ArrayList<>();
    }
    //method to add course in the list
    public void addCourse(T course){
        courseList.add(course);
    }
    //method to access course list
    public List<T> getCourseList(){
        return courseList;
    }
    //static method to display all course
    public static void displayCourse(List<? extends CourseType> courses){
        for (CourseType course : courses){
            out.println(course.toString());
        }
    }
}
