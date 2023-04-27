package com.blissvine.Exercises;


/*
Write a program to enter 10 numbers into an array and print the array after shifting all odd numbers to the top and even
 numbers below without changing the order of the numbers.


Nhi matlab koi bhi 10 numbers input krna hai.... Aur usme jo pehla odd aayega
 toh wo sabse pehle aayega phir dusra odd aur saare odd print hone ke baad even print hoga

SAMPLE INPUT: 5897234167

SAMPLE OUTPUT: 
5973178246
 */
import java.util.Scanner;

public class Even_Odd
{
    public static void main(String[] args)
    {
        int n, j = 0, k = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        int odd[] = new int[n];
        int even[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 != 0)
            {
                odd[j] = a[i];
                j++;
            }
            else
            {
                even[k] = a[i];
                k++;
            }
        }
        if(j > 1)
        {
            for(int i = 0;i < (j-1); i++)
            {
                System.out.print(odd[i]+",");
            }
            System.out.print(odd[j-1]);
        }
        else
        {
            System.out.println("No number");
        }
      System.out.print(",");
        if(k > 1)
        {
            for(int i = 0; i < (k-1); i++)
            {
                System.out.print(even[i]+",");
            }
            System.out.print(even[k-1]);
        }
        else
        {
            System.out.println("No number");
        }
    }
}