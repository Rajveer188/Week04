package com.tit.week04.day04.exception_propagation_methods;
import static java.lang.System.out;

public class ExceptionPropagation {
    //method that throws ArithmeticException
    public static void method1() throws ArithmeticException{
        int result = 10/0;
    }
    //method that call method1
    public static void method2() throws ArithmeticException{
        //call method 1
        method1();
    }
    //main method
    public static void main(String[] args) {
        //handle exception
        try{
            method2();
        }catch (ArithmeticException e){
            out.println("Handled exception in main");
        }
    }

}
