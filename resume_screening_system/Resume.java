package com.tit.week04.day01.generics.resume_screening_system;

import java.util.List;

public class Resume<T extends JobRole>{
    //attribute
    private T jobRole;

    //constructor
    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }
    //getter to get job role
    public T getJobRole() {
        return jobRole;
    }
    //method to process resume
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("processing resume for - " +resume.getName() + " " + resume.getJobRole());
        }
    }
}
