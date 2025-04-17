package com.java.internal;

public class Birthday {
    private String date; // Date of the birthday
    private int age; // Age of the person

    public Birthday() {
        // default constructor
    }

    public Birthday(String date, int age) {
        this.date = date;
        this.age = age;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void celebrate() {
        System.out.println("Celebrating a special birthday!");
    }
    @Override
    public String toString() {
        return "Birthday Date: " + date + ", Age: " + age;
    }
}
