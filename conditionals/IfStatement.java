package com.blissvine.conditionals;

public class IfStatement {
     public static void main(String[] args){
         puzzle1(); // prints 2 because we are using nested if-else and once a condition founds to be true then all the
                // other statements are bypassed.
     puzzle2(); // prints l < 20 and who am I? because we are using  independent statements so all the true statements
         // are executed
         puzzle3(); // Prints nothing because the outermost if condition acts as a big block and inside that big if block
         // condition there is another condition but since the outermost if condition is false then it  never executes what
         // is inside of is hence nothing is printed out to console.

         puzzle5(); //prints 6


     }


     private static void puzzle1(){
              int k = 15;
              if(k > 20){
                     System.out.println(1);
              }else if(k > 10) {
                    System.out.println(2);
                }else if(k < 20){
                     System.out.println(4);
              }else {
                    System.out.println(4);
              }
        }

        private static void puzzle2(){
              int l = 15;

              if(l < 20){
                   System.out.println("l > 20");
              }
               if(l > 20){
                    System.out.println("l > 20");
               }
               else {
                    System.out.println("Who am I ?");
               }
        }

        public static void puzzle3(){
                int m = 15;

                if(m>20){
                    if (m < 20){
                        System.out.println("m > 20");
                    }
                    else {
                        System.out.println("Who am I?");
                    }
                }
            }

    private static void puzzle5() {
        int number = 5;
        if (number < 0) {
            number = number + 10;
        }
        number++;
        System.out.println(number);
    }

}
