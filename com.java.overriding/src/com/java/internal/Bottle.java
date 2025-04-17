package com.java.internal;

public class Bottle {
    private int capacity;
    private String material;

    public Bottle() {
        // Default constructor
    }

    public Bottle(int capacity, String material) {
        this.capacity = capacity;
        this.material = material;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void fill() {
        System.out.println("Filling the bottle with water.");
    }
    @Override
    public String toString() {
        return "Capacity: " + capacity + "ml, Material: " + material;
    }
}
