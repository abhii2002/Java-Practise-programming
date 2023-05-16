package com.blissvine.Exercises;

/*
String someString = "This is a lot of text again"
write a code to print individual characters of the above string in separate line
for example
T
h
i
s

i
s

a

l
o
t
.
.
.
 */

public class PrintIndividualCharacters {
    public static  void main(String[] args) {

        String str = "This is a lot of text again";
        for (int i = 0; i < str.length(); i++) {
               System.out.println(str.charAt(i));
        }
    }


}
