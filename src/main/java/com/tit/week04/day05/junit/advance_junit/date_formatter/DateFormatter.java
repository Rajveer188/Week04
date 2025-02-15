package com.tit.week04.day05.junit.advance_junit.date_formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DateFormatter {
    //method to format date
    public String formatDate(String inputDate){
        SimpleDateFormat orignalDate = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        SimpleDateFormat formatedDate;
        try {
            date =  orignalDate.parse(inputDate);
            formatedDate = new SimpleDateFormat("dd-MM-yyyy");

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return formatedDate.format(date);
    }
}
