package com.blissvine.Dates;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesInJava{
    public static void main(String[] args){
        LocalDate date =  LocalDate.now();
        System.out.println(date);
        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println(dateAndTime);
        LocalTime time = LocalTime.now();
        System.out.println(time);


        //Java methods that provide extra information
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());
        System.out.println(today.lengthOfYear());
        System.out.println(today.getMonthValue());
        System.out.println(today.isLeapYear());

        // Operations that can  be performed on dates eg. Add number of months or years to a specific date
       System.out.println(today.plusDays(100));
       System.out.println(today.plusMonths(100));
       System.out.println(today.plusYears(100));
       System.out.println(today.minusYears(100));

       //Operations that can be performed on dateTime are :
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.plusHours(4));
        System.out.println( now.plusMinutes(5));
        System.out.println(now.plusNanos(222));
        System.out.println( now.plusYears(44));
        System.out.println( now.plusWeeks(12));
        System.out.println(now.plusMonths(38));


        // Creating manual dates, for example to use  date methods on  yesterdays date we can use the following approach

        LocalDate  yesterday = LocalDate.of(2018, 01, 31);
        System.out.println(yesterday);

        // changing the year in yesterday's date variable ( modifying values )
        System.out.println(yesterday.withYear(2016));
        System.out.println(yesterday.withDayOfMonth(20));
        System.out.println(today.withMonth(3));
        System.out.println(today.withDayOfYear(120));

     // comparing dates
        System.out.println(today.isBefore(yesterday));
        System.out.println(today.isAfter(yesterday));


    }
}
