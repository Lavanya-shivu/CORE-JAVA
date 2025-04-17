package com.java.internal;

public class Bag {
    private String color;
    private int capacity; // in liters

    public Bag() {
        // default constructor
    }

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void carry() {
        System.out.println("Carrying the bag");

    }
    @Override
    public String toString() {
        return "Color: " + color + ", Capacity: " + capacity + "L";
    }
}
