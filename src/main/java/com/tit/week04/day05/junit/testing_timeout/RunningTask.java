package com.tit.week04.day05.junit.testing_timeout;
import static java.lang.System.out;

public class RunningTask {
    public String longRunningTask(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            out.println("exception in sleep");
        }
        return "task completed";
    }
}

