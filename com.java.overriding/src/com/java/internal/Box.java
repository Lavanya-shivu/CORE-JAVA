package com.java.internal;

public class Box {
    protected String material; // Material of the box (e.g., cardboard, metal)
    protected String size; // Size of the box (e.g., small, medium, large)

    public Box() {
        // Default constructor
    }

    public Box(String material, String size) {
        this.material = material;
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void open() {
        System.out.println("Opening the box.");
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Size: " + size;
    }
}
