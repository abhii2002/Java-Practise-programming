package com.blissvine.Array;

import java.util.Arrays;

public class Array {



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        System.out.println(Arrays.toString(numbers));

        // Accessing and modifying values in an array using index


        int[] arr = {1, 2, 3, 4, 5};

        // Accessing the value
        System.out.println(arr[1]); // output -> 2
        //modifying a value inside an array
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(Arrays.toString(arr));  // output -> {10, 20, 3, 4, 5}


        // getting length of an Array using .length property
        System.out.println(arr.length);


        int[] newArr = new int[5];
        System.out.println(Arrays.toString(newArr));

        //Initializing an array with default values
        int[] rollNo = new int[5];
        Arrays.fill(rollNo, 10); // we filled the default values in rollNo variable with 10
        System.out.println(Arrays.toString(rollNo));


        // Comparing two arrays using equals method
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(Arrays.equals(array1, array2));


        // Sorting an array
        int[] array3 = {3, 4, 2, 3,};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));



    }





}
