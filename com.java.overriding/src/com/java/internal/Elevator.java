package com.java.internal;

public class Elevator {
    private String brand;
    private int capacity;

    public Elevator() {
    }

    public Elevator(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void move() {
        System.out.println("Elevator is moving.");
    }
    @Override
    public String toString() {
        return "Brand: " + brand + ", Capacity: " + capacity + " people";
    }
}
