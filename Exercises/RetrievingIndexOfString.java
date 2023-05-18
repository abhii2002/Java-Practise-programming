package com.blissvine.Exercises;

public class RetrievingIndexOfString {
    public static void main(String[] args){
         String str = "This is a long text";
         String str2 = "Abhishek Singh";
         System.out.println(str.indexOf('e'));
         System.out.println(str.lastIndexOf('t'));
          // to check if string contains a given text or not
         System.out.println(str.contains("text"));
         System.out.println(str.contains("saf"));
         System.out.println(str.startsWith("This"));
         System.out.println(str.endsWith("text"));
         System.out.println(str.isEmpty());
         System.out.println("".isEmpty());
         // compare if two strings equal (case-sensitive )
         System.out.println(str.equals(str2));
         //  compare if two strings equal (not case-sensitive)
        System.out.println(str.equalsIgnoreCase(str2));

        /*
        Strings are immutable that means once we declared and assigned string the value of the string can not be ever changed
        after that
         */

        //String concatenation

        String str3 = "Milky Loves ";
        String str4 = "Abhishek";

        System.out.println(str3.concat(str4));

        // Trim starting and ending space from a string
        String str5 = " I will dance dance dance with my hands hands hands ";
        System.out.println(str5.trim());

        //Join strings with the first character inside join method
        System.out.println(String.join("," , "A", "B", "C"));  //output -> A,B,C
        // Replace characters in a string
       String replacedChar1 =  "Hello".replace("He", "Pe");
       System.out.println(replacedChar1);
       String replacedChar2 = "Hello".replace('H', 'E');
       System.out.println(replacedChar2);


    }


}
