package com.blissvine.Exercises;

import java.util.*;
class Employee
{
    int pan;
    String name;
    double tax,tax_income;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pan number");
        pan = sc.nextInt();
          sc.nextLine();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter the taxable income");
        tax_income = sc.nextDouble();
    }
    void calc()
    {
        if(tax_income<=100000)
        {
            tax = 0;
        }
        else if(tax_income>100000 && tax_income<=150000)
        {
            tax = 10/100*(tax_income-100000);
        }
        else if(tax_income>150000 && tax_income<=250000)
        {
            tax = 5000 + 20/100*(tax_income-150000);
        }
        else
        {
            tax = 25000 + 30/100*(tax_income-250000);
        }
    }
    void display()
    {
        System.out.println("Pan Number"+"\t"+"Name"+"\t"+"Tax-income"+"\t"+"Tax"+"\t");
        System.out.println(pan+"\t"+name+"\t"+tax_income+"\t"+tax+"\t");
    }
    public static void main(String args[])
    {
        Employee ob = new Employee();
        ob.input();
        ob.calc();
        ob.display();
  }
}