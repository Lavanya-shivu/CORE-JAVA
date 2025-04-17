package com.java.internal;

public class Dragon {
    private String color;
    private int age;

    public Dragon() {
    }

    public Dragon(String color, int age) {
        this.color = color;
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    public void fly() {
        System.out.println("The dragon spreads its wings and flies.");
    }
    @Override
    public String toString() {
        return "Dragon Color: " + color + ", Age: " + age + " years";
    }
}
