package com.tit.week04.day01.generics.resume_screening_system;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        //create resume for software engineer
        SoftwareEngineer rajveerResume = new SoftwareEngineer("Rajveer kajle");
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>(rajveerResume);

        //create resume for data scientist
        DataScientist darshanResume = new DataScientist("Darshan Yadav");
        Resume<DataScientist> dataScientistResume = new Resume<>(darshanResume);

        //create resume for product manager
        ProductManager adityaResume = new ProductManager("Aditya Gupta");
        Resume<ProductManager> productManagerResume = new Resume<>(adityaResume);

        //add resume to list
        List<JobRole> resumeList = new ArrayList<>();
        resumeList.add(softwareEngineerResume.getJobRole());
        resumeList.add(dataScientistResume.getJobRole());
        resumeList.add(productManagerResume.getJobRole());

        Resume.processResumes(resumeList);
    }
}

