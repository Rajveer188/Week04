package com.tit.week04.day05.junit.advance_junit.temperature_converter;

public class TemperatureConverter {
    //method to Converts Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius){
        double fahrenheit = (celsius * 9/5 + 32);
        return fahrenheit;
    }
    //method to Converts Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit-32)*5/9;
        return celsius;
    }
}
