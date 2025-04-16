package com.java.internal;

public class Carpet {
    protected String material; // Material of the carpet (e.g., wool, nylon, cotton)
    protected String color;    // Color of the carpet (e.g., red, blue, beige)

    // Default constructor
    public Carpet() {
    }

    // Constructor to initialize variables
    public Carpet(String material, String color) {
        this.material = material;
        this.color = color;
    }

    // Setter for material
    public void setMaterial(String material) {
        this.material = material;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
    public void layDown() {
        System.out.println("Carpet is laid on the floor");
    }
    @Override
    public String toString() {
        return "Carpet Material: " + material + ", Carpet Color: " + color;
    }
}
