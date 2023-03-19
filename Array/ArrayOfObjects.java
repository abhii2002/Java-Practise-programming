package com.blissvine.Array;

import java.util.Arrays;

public class ArrayOfObjects {
    public static void main(String[] args){
          ArrayOfObjects[] objectArrays = new ArrayOfObjects[5];

          // modfying the value of the object array
           objectArrays[0]  = new ArrayOfObjects();
           objectArrays[1] = new ArrayOfObjects();

           System.out.println(Arrays.toString(objectArrays));

           // The shortcut way of doing this is
             ArrayOfObjects[] objectArray = {new ArrayOfObjects(), new ArrayOfObjects(), new ArrayOfObjects()};
             System.out.println(Arrays.toString(objectArray));

    }
}
