package com.blissvine.Array;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args){
        int[] listOfMarks = {87, 90, 100};

          Student student = new Student("Abhishek",  listOfMarks);
         int getMarks = student.getNumberOfMarks();
         System.out.println(getMarks);

         double average1 = student.getAverageMarks();
         System.out.println("Marks Average : " + average1);

         int sum = student.getTotalSumOfMarks();
         System.out.println("Sum of Marks : " + sum);

         int maximumMarks = student.getMaximumMark();
         System.out.println("Maximum Marks : " + maximumMarks);

        int minimumMarks = student.getMinimumMark();
        System.out.println("Minimum Marks : " + minimumMarks);

        BigDecimal average2  = student.getAverageMarksBigDecimal();
        System.out.println("Exact Average is : " + average2);

    }
}
