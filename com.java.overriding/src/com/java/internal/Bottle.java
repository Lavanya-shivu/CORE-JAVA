package com.java.internal;

public class Bottle {
    protected int capacity; // Capacity of the bottle (in milliliters)
    protected String material; // Material of the bottle (e.g., plastic, glass)

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
