package com.blissvine.conditionals;

import java.util.Scanner;

/*
The switch statement is an alternative for nested if-else statements. When we have set of choices and we want to execute
the code based on that choice, we can use switch statement.
 */
public class SwitchStatement {

    private static void performOperationUsingSwitch(int number1, int number2, int choice){
        switch (choice) {
            case 1:
                System.out.println("Result " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result " + (number1 * number2));
                break;
            case 3:
                System.out.println("Result " + (number1 - number2));
                break;
            case 4:
                System.out.println("Result " + (number1 / number2));
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1:  ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();
        //Printing the menu
        System.out.println("1. Add");
        System.out.println("2. multiply");
        System.out.println("3. subtract");
        System.out.println("4. divide");

        System.out.println("Enter Choice: ");
        int choice = scanner.nextInt();

        System.out.println("Your choices are: ");
        System.out.println("Number1 " + number1);
        System.out.println("Number2 " + number2);
        System.out.println("Choice " + choice);

        performOperationUsingSwitch(number1, number2, choice);


    }
}
