package com.java.internal;

public class Tub {
    private String material;
    private int capacity;

    public Tub(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void fill() {
        System.out.println("Filling the tub with water.");
    }

    @Override
    public String toString() {
        return "Tub [Material: " + material + ", Capacity: " + capacity + " liters]";
    }
}
