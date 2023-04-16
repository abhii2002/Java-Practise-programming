package com.blissvine.Exercises;

public class BiNumber {

    //Member variables
    int number1;
    int number2;

    BiNumber(int number1, int number2){
         this.number1 = number1;
         this.number2 = number2;
    }

   int add(){
        return number1 + number2;
    }

    int multiply(){
        return number2*number1;
    }

    void Double(){
       this.number1 *= number1;
       this.number2 *= number2;
    }


    //Getter
    int getNumber1(){
        return number1;
     }

     int getNumber2(){
        return number2;
     }

}
