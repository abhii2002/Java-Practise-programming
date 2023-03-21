package com.blissvine.Array;

/*
 Create an Array marks with 8 elements and write a code to loop around this array and
 print all the values which are present in this array
 */


public class Exercise1 {
    public static void main(String[] args){
          int[] arr = {10, 20, 30, 40, 50, 60, 7, 8};

          // first approach
        //  for(int i = 0; i < arr.length; i++){
          //    System.out.println(arr[i]);
          // }

          //enhanced for loop approach
          for(int arrays: arr){
                System.out.println(arrays);
          }

    }
}
