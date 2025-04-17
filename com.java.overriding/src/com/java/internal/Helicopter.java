package com.java.internal;

public class Helicopter {
    private String model;     // Model of the helicopter
    private int capacity;     // Capacity of the helicopter (number of passengers)

    // Default constructor
    public Helicopter() {
    }

    // Constructor to initialize model and capacity
    public Helicopter(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    // Setters for model and capacity
    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void fly() {
        System.out.println("Helicopter is flying in the sky");
    }
    @Override
    public String toString() {
        return "Helicopter [Model: " + model + ", Capacity: " + capacity + " passengers]";
    }
}
