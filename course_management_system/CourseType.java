package com.tit.week04.day01.generics.course_management_system;

//abstract class to represent course type
public abstract class CourseType {
    //Attribute
    private String courseName;
    private int courseDuration;
    private double courseFee;

    //Constructor
    public CourseType(String courseName, int courseDuration, double courseFee) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
    }
    //overriding toString method

    @Override
    public String toString() {
        String courseDetails = "course name - " + courseName +
                ", course duration - " + courseDuration + " month " +
                ", course fee - " + courseFee;
        return courseDetails;
    }
}
