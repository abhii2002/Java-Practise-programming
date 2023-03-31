package com.blissvine.basics;
/*
 Floating point data types are not really accurate, so we can not use them in a financial calculation
 So we should use big decimal class to achieve accuracy in terms of accuracy
 */

import com.blissvine.Exercises.MyChar;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class Bigdecimal {
    public static void main(String[] args){
        double a = 34.56789876 + 34.2234;
        // this will not print accurate results because floating point representation does not allow accurate representation
        // of your decimal values.
        System.out.println(a);

        // Therefore it is recommended not to use any of the floating point data types (either float or double)
        // in calculations where you would want exact accuracy in terms of the results

        /*
        What is BigDecimal ?
        It is a class in java, and we can pass a string value to it
         */

        // Creating BigDecimal
        BigDecimal number1 = new BigDecimal("34.56789876");
        BigDecimal number2 = new BigDecimal("34.2234");

       System.out.println(number1.add(number2));

      // BigDecimal class in java is an immutable class which means we can not change the value of a big decimal
        // object once it is created (so number 1 and number 2 will always remain same once it is created), we can only
        // create new variables but can not change the value of number1 and number 2
        BigDecimal number3 = number1.add(number2);
        System.out.println(number3);

        //If we use doubles or floats instead of string literal inside the parameters of BigDecimal class, we will not
        // get the accurate the results
        // Example
        BigDecimal number10 = new BigDecimal(34.4354523467);
        // System.out.print(number10); // Result :- 34.4354523467000035452656447887420654296875 (inaccurate)

         // We pass a string literal to the BigDecimal constructor to get the accurate value
        // So whenever we get a value, a hardcoded value into BigDecimal we  should always use string constructor

        // BigDecimals using integers


        int  i = 5;
        BigDecimal number = new BigDecimal("11.5");
        // Adding the integer value (i) to big decimal
        number.add(new BigDecimal(i));
        System.out.println(number.add(new BigDecimal(i)));


        System.out.println(number.divide(new BigDecimal(100)));

        System.out.println(number.multiply(new BigDecimal(34)));

    }
}

