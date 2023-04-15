package com.blissvine.Exercises.InheritenceExercise;

public class Person {
    String name;
    String phone;
    String email;

    public Person(){
        System.out.println("Person Constructor");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getPhone() {
        return phone;
    }

    public void setPhone(String  phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
       return String.format("name - %s, email - %s, phoneNumber - %s", name, email, phone);
    }
}
