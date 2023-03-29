package com.blissvine.Array;

import java.util.Arrays;

public class VariableArgumentsInArray {

    String name;
  int[]  listOfMarks ;
    VariableArgumentsInArray(String name, int[] listOfMarks){
        this.name = name;
        this.listOfMarks = listOfMarks;
    }

    //Declaring a variable argument
   static void print(int...values){
         System.out.println(Arrays.toString(values));
    }

    public  void  sum(int...values){
        int sum = 0;
         for (int marks: listOfMarks){
             sum += marks;
         }
           System.out.println(sum);

        }


    public static void main(String[] args) {

        // How to pass an array directly into the constructor
        VariableArgumentsInArray student = new VariableArgumentsInArray("Abhishek", new int[]{1, 2, 3});

        // but since it is not a good way to pass arguments we need a way to pass arguments in a much simpler way
        // For example
        // VariableArgumentsInArray student = new VariableArgumentsInArray("Abhishek", 1,2,3);
        // This is where variable arguments comes into play (see above print method)
        // now with the help of variable argument (Varargs), we can pass as many as arguments, we want
        print(1, 2);
        print(1, 2, 3, 4);
        student.sum(1,2,3);


    }

    }





