package com.blissvine.Array;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    String name;
   int[]  listOfMarks ;

  public  Student(String name, int[] listOfMarks){
       this.name = name;
       this.listOfMarks = listOfMarks;
  }


  public int getNumberOfMarks(){
      return listOfMarks.length;
  }

  public int getTotalSumOfMarks(){
      int sum = 0;
       for(int marks: listOfMarks){
             sum = sum + marks;
       }
     return sum;
  }

  public int getMaximumMark(){
      int maximum = Integer.MIN_VALUE;
      for (int marks: listOfMarks){
          if (marks > maximum){
              maximum = marks;
          }
      }
      return maximum;
  }

    public int getMinimumMark(){
        int minimum = Integer.MAX_VALUE;
        for (int marks: listOfMarks){
            if (marks < minimum){
                minimum = marks;
            }
        }
        return minimum;
    }


    //approach one
  public double getAverageMarks(){
      double sum = 0;
      double average = 0;
       for (int mark: listOfMarks){
            sum = sum + mark;
            average = (sum/2);
       }
       return average;
  }

  //approach 2 -> the most precise calculation of floating points using big decimal
    public  BigDecimal getAverageMarksBigDecimal(){
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3 , RoundingMode.UP);
    }


}
