package com.java.internal;

public class Box {
    private String material;
    private String size;

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
