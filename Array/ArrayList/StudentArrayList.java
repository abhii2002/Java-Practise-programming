package com.blissvine.Array.ArrayList;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class StudentArrayList {
    String name;
    ArrayList<Integer> listOfMarks = new ArrayList<Integer>() ;

    StudentArrayList(String name, int...listOfMarks){ // here we are using variable arguments (Varargs)
        this.name = name;
        for(int marks:listOfMarks){
             this.listOfMarks.add(marks);
        }
    }


    public int getNumberOfMarks(){
        return listOfMarks.size(); // for arrayList to get the size of the arrayList, we use size() method
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

    // with the help of toString() method we can print the content of the student object
    public  String toString(){
         return name + listOfMarks;
    }

    public void addMarks(int marks){
         listOfMarks.add(marks);
    }

    public void removeMarks(int index){
         listOfMarks.remove(index);
    }


}
