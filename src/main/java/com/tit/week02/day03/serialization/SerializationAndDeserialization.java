package com.tit.week02.day03.serialization;

import java.io.*;
import java.util.List;

import static java.lang.System.out;
public class SerializationAndDeserialization{
    //method to perform serialization
    public void performSerialization(List<Employee> employeeList, String filePath){
        //create object of ObjectOutputStream
        try(FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            //write object to file
            objectOutputStream.writeObject(employeeList);

            out.println("object stored successfully");
        } catch (IOException e) {
            out.println("exception while writing object");
        }
    }

    public void performDeserialization(String filePath){
        try(FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            //perform deserialization
            List<Employee> employeeList = (List<Employee>)objectInputStream.readObject();

            //print employee
            for(Employee employee : employeeList){
                out.println(employee);
            }
        } catch (FileNotFoundException e) {
            out.println("file not found");
        } catch (IOException e) {
            out.println("exception while reading object");
        } catch (ClassNotFoundException e) {
            out.println("class not found");
        }
    }
}
