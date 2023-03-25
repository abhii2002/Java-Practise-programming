package com.blissvine.Array;

public class LoopingInArray {
  public static void main(String[] args){
       int[]  marks = {40, 30, 20, 33};

       int sum = 0;
       //enhanced for loop to loop through an array
       for(int mark: marks){
            sum = sum + mark;
       }
       System.out.println(sum);

  }

}
