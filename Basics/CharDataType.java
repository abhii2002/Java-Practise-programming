package com.blissvine.basics;

public class CharDataType {
    public static void main(String[] args) {
        // Character Data Type in java (takes 2 bytes in memory)
        //Defining a character in java
        char ch = 'a';
        // There are a wide variety of characters that we can represent in java and these characters have a unicode value
        // Each of the character we can assign in a language has a unicode value.

        char doubleQuoteInUniCode = '\u0022';
        System.out.println(doubleQuoteInUniCode); // Will print " double quote as u0022 is a double quote in unicode values

        // We can also use those characters that are not present on the keyboard with the help of unicode value
        //Example
        char ch2 = '\u00A2';
        System.out.println(ch2); // will print ¢

        // A number value can also be assigned to a character (Ascii)
        char ch3 = 65;
        System.out.println(ch3); // Will print -> A

        // We can also perform integers operations
        ch3++;
        System.out.println(ch3);  // Will print B since value of ch3 is 67 now

        System.out.println(ch3 + 5); // Will print 71 and not the character value because operation  between a char and int
        // is always an inter because integer is a larger data type than a character data type

         // Printing the ascii value of a character
         char char1 = 'A';
         int charToInt = (int) char1;
         System.out.println("The value of A in ascii table is :  " + charToInt);

    }
}
