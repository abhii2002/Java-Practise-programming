package com.blissvine.Exercises;

/* Ask User for Input
    1. Enter two numbers
    2. Choose an operation
        o add
        o multiply
        o divide
        o subtract

    3. Publish result
*/

import java.util.Scanner;

public class MenuRunner {
  public static void main(String[] args) {

      double add, multiply, subtract, divide;

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

      if(choice == 1){
          System.out.println("Result " + (number1 + number2));
      }else if(choice == 2){
          System.out.println("Result " + (number1 * number2));
      }else if(choice == 3){
           System.out.println("Result " + (number1 - number2));
      }else if(choice == 4){
            System.out.println("Result " + (number1 / number2));
      }else {
          System.out.println("Wrong choice");
      }
  }
}
