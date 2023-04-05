package com.blissvine.basics;

import java.util.Scanner;

public class UserInputInJava {
    public static void main(String[] args){
        // We can take user input in java using the scanner class.
        //In scanner class, we can pass from where we want to get the value for example to take a user input, we need to pass
        // System.in within the scanner class

        Scanner scanner = new Scanner(System.in); // making object of the scanner class
        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();
        System.out.println("Your number is " + number1);

    }

}
