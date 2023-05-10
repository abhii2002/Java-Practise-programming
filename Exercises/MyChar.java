package com.blissvine.Exercises;

public class MyChar {

     private char ch;

       public MyChar(char ch){
             this.ch = ch;
       }

    public boolean isVowel() {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U' ){
                return  true;
            }else{
                return  false;
            }
       }
       boolean isDigit(){
            if(ch >= 48 && ch <= 57){ // between 0 and 9
                return  true;
            }else{
                return  false;
            }
       }
       public  boolean isAlphabet(){
            if(ch >= 65 && ch <= 90 || ch >=97 && ch <= 122 ){
                return true;
            }else{
                return false;
            }
       }

       public boolean isConsonant(){
//           if(ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117
//                   || ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85){
//               return false;
//           }else{
//               return true;
//           }

           // Alternatively
           if(isAlphabet() &&  !isVowel()){
               return  true;
           }else {
               return  false;
           }
       }

       // When there is no need of using any data from the class (example printLowerCaseAlphabets) then it is a better choice to use a static method
    // in these kind of situations There is no need to create an object and then call a method on it.


    //When a method is static, we don't need to crate an instance (object) we can directly call it by using the class name
    public static void printLowerCaseAlphabets() {
        for (char ch = 97; ch <= 122; ch++) {
                  System.out.println(ch);
        }
    }

    public static void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }
}

