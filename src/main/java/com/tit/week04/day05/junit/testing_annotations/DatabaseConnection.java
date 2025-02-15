package com.tit.week04.day05.junit.testing_annotations;

import static java.lang.System.out;

public class DatabaseConnection{
    //method for connecting database
    public void connect(){
        out.println("\ndatabase connected");
    }
    //method for disconnecting database
    public void disconnect(){
        out.println("database closed");
    }
    //method to perform database operation
    public boolean performOperations(){
        out.println("performing operations");
        return true;
    }
}
