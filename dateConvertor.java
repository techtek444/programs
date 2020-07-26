package edu.pdx.cs410J.techtek;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateConvertor {

    /**
     *
     * @param date
     * @return Return date in short format of ype String
     */
    public static String dateToStringFormat(Date date) {

        String dateShort = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT).format(date);

        return(dateShort);
    }

    /**
     *
     * @param dateString converts the string to date
     * @return date in Java.util.Date
     */
    public static Date getDateFromString(String dateString) {
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm aa");
        try {
            date = sd.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Could not convert string to date");
        }
        return date;
    }
    /**
     *
     * @param dateString converts the string to date
     * @return date in Java.util.Date
     */
    public static Date getDateTextString(String dateString) {
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yy, hh:mm aa");
        try {
            date = sd.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Could not convert string to date");
        }
        return date;
    }

}
