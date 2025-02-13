package com.tit.week02.day03.data_streams;

import java.io.*;

import static java.lang.System.out;

public class StoreStudentData{
    private static String filePath = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\student.bin";
    //method to write data
    private static void writeStudentData(String filePath, int rollNo, String name, double gpa) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filePath, true))) {
            dataOutputStream.writeInt(rollNo);
            dataOutputStream.writeUTF(name);
            dataOutputStream.writeDouble(gpa);
        }catch (IOException e) {
            out.println("error writing file");
        }
    }
    private static void readStudentData(String filePath) {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath))) {
            out.println("Student Details");
            while (dataInputStream.available() > 0) {
                int rollNo = dataInputStream.readInt();
                String name = dataInputStream.readUTF();
                double gpa = dataInputStream.readDouble();
                out.println("Roll No " + rollNo + ", Name " + name + ", GPA " + gpa);
            }
        } catch (IOException e) {
            out.println("error reading file");
        }
    }
    public static void main(String[] args) {
        //store student details
        writeStudentData(filePath, 101, "Rajveer", 9.5);
        writeStudentData(filePath, 102, "Darshan", 9.8);

        //read student data
        readStudentData(filePath);
    }
}
