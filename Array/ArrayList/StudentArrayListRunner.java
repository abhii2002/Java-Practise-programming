package com.blissvine.Array.ArrayList;

import com.blissvine.Array.Student;
import java.math.BigDecimal;

public class StudentArrayListRunner {
    public static void main(String[] args){

        StudentArrayList student = new StudentArrayList("Milky", 1,2,3,4);
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

        System.out.println(student);

        student.addMarks(11);
        System.out.println(student);

        student.removeMarks(2);
        System.out.println(student);


    }
}
