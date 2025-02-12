package com.tit.week04.day02.queue_interface.hospital_triage_system;

import java.util.PriorityQueue;

import static java.lang.System.out;

public class HospitalTriageSystem {
    public static void main(String[] args) {
        //create queue to store patient
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        //add patient to queue
        queue.add(new Patient("Rajveer", 3));
        queue.add(new Patient("Darshan", 5));
        queue.add(new Patient("Ankit", 2));

        out.println("treatment order");
        while (!queue.isEmpty()) {
            Patient currentPatient = queue.poll();
            out.println(currentPatient);
        }
    }
}
