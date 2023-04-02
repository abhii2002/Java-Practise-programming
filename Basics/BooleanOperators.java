package com.blissvine.basics;

/*
The boolean operators are important because these are used in conditions ( like if, for while etc...)
The operators in these kind of conditions are what called logical operators, the result of a condition is always either
true or false  and we can combine two boolean values by using logical operators.
 */

public class BooleanOperators {
    public static void main(String[] args){
        //Relational operators -> used to compare two values
        /*
           Common relational operators :
           <
           >
           <=
           >=
         */

        int i = 7;
        System.out.println(i<7); // false
        System.out.println(i<8); // true

        // Comparison operator (==): Used to compare two values
        System.out.println(i==7);// true
      System.out.println(checkInBetween());



    }

    // Logical operators ( can be performed on two booleans and returns a boolean value )
    // Example ( Logical and (&&) operator.
    public static boolean checkInBetween(){ // we used static so that we can directly call the method without making the object of it
        int j = 17;
        if(j >= 15 && j <= 25) {
              return  true;
        }else {
            return  false;
        }
    }
}

// If any of the conditions is false in a logical && operator, the result is false so for a true result, both the conditions
// must match or true

// Logical and (&&) operator truth table :
/*
 true && true -> true
 true && false -> false
 false && true -> false
 false && false -> false
 */

// Logical Or (||) operator : Or operation is true if at least one of the operands is true
// Logical and (||) operator truth table :

/*
 true|| true -> true
 true || false -> true
 false || true ->  true
 false || false -> false
 */

// Logical Xor (^) operator : Xor operation is true if both the operands are different from each other
// Logical and (^) operator truth table :

/*
 true ^ true -> false
 true ^ false -> true
 false ^ true ->  true
 false ^ false -> false
 */

// Logical not (!) operator : it reverse the result

/*
 !true -> false
 !false -> true
 */


