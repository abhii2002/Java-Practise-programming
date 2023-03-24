package com.blissvine.Array;
/*
Create a String array with days of the week
 "Sunday", "Monday" , "Tuesday" , "Wednesday". "Thursday"
 "Friday", "Saturday"

 Find the day with most number of letters in it
 The Longest String

 Print days of the week backwards
 */

public class Exercise2 {

    String[] weekDays = { "Sunday", "Monday" , "Tuesday" , "Wednesday", "Thursday",
            "Friday", "Saturday"};

    String getMaxLetterWeekDay() {
        String dayWithMostCharacters = "";
        for (String days : weekDays) {
            if (days.length() > dayWithMostCharacters.length()) {
                dayWithMostCharacters = days;
            }
        }
        return dayWithMostCharacters;
    }

    void printDaysInReverse(){
        for(int i = weekDays.length -1; i >= 0;  i--){
           System.out.println(weekDays[i]);
        }

    }
    public static void main(String[] args){
       Exercise2 weekdays = new Exercise2();
       System.out.println(weekdays.getMaxLetterWeekDay());
       weekdays.printDaysInReverse();
    }


}
