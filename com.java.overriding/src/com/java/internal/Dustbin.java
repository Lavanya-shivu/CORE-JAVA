package com.java.internal;

public class Dustbin {
    private String material;
    private int capacity;

    public Dustbin() {
    }

    public Dustbin(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void openLid() {

        System.out.println("Opening the dustbin lid.");
    }
    @Override
    public String toString() {
        return "Dustbin Material: " + material + ", Capacity: " + capacity + " liters";
    }
}
