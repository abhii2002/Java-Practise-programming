package com.blissvine.Exercises;

import java.util.Scanner;

/*
 Ask user for a number.
 Print the cube of the number.
 Do this repeatedly until user enters a negative number.
 */
public class PrintCubeUntilNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = -1;
        do {
            if(number >=0) {
                System.out.println("Cube is " + number * number * number);
            }
            System.out.println("Enter a number: ");
            number = scan.nextInt();
        } while (number >= 0);
        System.out.println("Thank You! Have Fun!");

    }

}
