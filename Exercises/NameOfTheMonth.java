package com.blissvine.Exercises;

public class NameOfTheMonth {

    // when we use return statement, we don't need a break statement in our switch statement because the flow goes out
    // automatically in a return statement
    public static String determineNumberOfMonth(int monthNumber){
           switch (monthNumber){
               case 1:
                   return "January";
               case 2:
                   return "February";
               case 3:
                    return "March";
               case 4:
                   return "April";
               case 5:
                   return "May";
               case 6:
                   return "June";
               case 7:
                   return "July";
               case 8:
                   return "August";
               case 9:
                   return "September";
               case 10:
                    return "October";
               case 11:
                    return "November";
               case 12:
                   return "December";
           }

           return "Invalid !";
    }

    public static void main(String[] args){
         System.out.println(determineNumberOfMonth(5));
    }

}
