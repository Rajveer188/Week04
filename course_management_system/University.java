package com.tit.week04.day01.generics.course_management_system;

import static java.lang.System.out;

public class University {
    public static void main(String[] args) {
        //create exam course and add them to course list
        Course<ExamCourse> examCourses = new Course<>();

        ExamCourse dsaCourse = new ExamCourse("DSA", 4,1000);
        ExamCourse cnCourse = new ExamCourse("Computer Network", 3,1000);

        examCourses.addCourse(dsaCourse);
        examCourses.addCourse(cnCourse);

        //create assignment course and add them to course list
        Course<AssignmentCourse> assignmentCourses = new Course<>();

        AssignmentCourse oopCourse = new AssignmentCourse("OOP's", 1, 500);
        AssignmentCourse mlCourse = new AssignmentCourse("Machine Learning", 1, 450);

        assignmentCourses.addCourse(oopCourse);
        assignmentCourses.addCourse(mlCourse);

        //create research course and add them to course list
        Course<ResearchCourse> researchCourses = new Course<>();

        ResearchCourse bigdataCourse = new ResearchCourse("Big Data", 12, 2000);
        ResearchCourse aiCourse = new ResearchCourse("AI", 12, 1950);

        researchCourses.addCourse(bigdataCourse);
        researchCourses.addCourse(aiCourse);

        //print all courses
        out.println("Exam courses - ");
        Course.displayCourse(examCourses.getCourseList());
        out.println("\nAssignment courses - ");
        Course.displayCourse(assignmentCourses.getCourseList());
        out.println("\nResearch courses - ");
        Course.displayCourse(researchCourses.getCourseList());

    }
}
