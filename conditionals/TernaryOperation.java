package com.blissvine.conditionals;

/*
 For one line condition ternary operator is very useful
 Syntax of ternary operation :-
variableName = (condn? valueIfcondnIsTrue: valueIfFalse)
 */

public class TernaryOperation {
public static void main(String[] args) {
    boolean isEven;
    int i = 6;
    isEven = (i % 2 == 0 ? true : false);
    System.out.println(isEven);

    //Ternary operator can be used with other operators as well
    String even;
    even = (i%2 == 0 ? "YES" : "NO");
    System.out.println(even);
   }
}
