package com.tit.week04.day02.queue_interface.hospital_triage_system;

//class to represent patient
public class Patient implements Comparable<Patient>{
    //Attribute
    private String name;
    private int severity;

    //constructor
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient patient) {
        int result = Integer.compare(patient.severity, this.severity);
        return result;
    }
    @Override
    public String toString() {
        String patientDetails =  "name - " + name + " severity-  " + severity;
        return patientDetails;
    }
}
