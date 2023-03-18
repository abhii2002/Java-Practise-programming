package com.blissvine.Array.ArrayList;

import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("Falak");

        // An arrayList can even have more than one data type , for example we can store integers and strings
        // together  inside an arrayList but this is not a good practise we should always construct an arrayList
        // with same data type
        arrayList.add(1);
        System.out.println(arrayList);

        /*
        Creating an arrayList of specific data-type
         */

        ArrayList<String> knownLanguages = new ArrayList<String>();
        knownLanguages.add("Python");
        knownLanguages.add("Java");
        knownLanguages.add("Kotlin");
        knownLanguages.add("JavaScript");

        System.out.println(knownLanguages);

        //Removing or deleting a element from an arrayList
        knownLanguages.remove(0);

        System.out.println(knownLanguages);

    }
}
