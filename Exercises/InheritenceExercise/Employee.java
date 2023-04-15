package com.blissvine.Exercises.InheritenceExercise;

import java.math.BigDecimal;

public class Employee extends Person{
    private String  title;
    private String employer;
    private char employeeGrade;
    private BigDecimal salary;

    public Employee(){
        /* Always remember that as soon as when we create a constructor in the subclass at the very first line automatically
        the super class constructor will be invoked
         */

        //super(); -> implicitly there will be a super method call implicitly, so here this method is calling the contructor
        //of our super class (i.e Employee)

        System.out.println("Employee Constructor");
    }


    public String getTitle(){
         return title;
    }

    public void setTitle(String title){
         this.title =  title;
    }


    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;

    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }


    public String toString(){
        // we use super.toString method to print the values from the super class or parent class (here Person) in our base
        //class (here Employee)
         return  String.format(super.toString() + "title - %s, employer - %s, employerGrade - %c",
                 title, employer, employeeGrade);
    }


}
