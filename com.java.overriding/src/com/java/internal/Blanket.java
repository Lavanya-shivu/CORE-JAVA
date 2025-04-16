package com.java.internal;

public class Blanket {
    protected String material; // Material of the blanket (e.g., wool, cotton)
    protected String size; // Size of the blanket (e.g., small, medium, large)

    public Blanket() {
        // Default constructor
    }

    public Blanket(String material, String size) {
        this.material = material;
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void cover() {
        System.out.println("The blanket covers the body.");
    }
    @Override
    public String toString() {
        return "Material: " + material + ", Size: " + size;
    }
}
