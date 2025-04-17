package com.java.internal;

public class Blanket {
    private String material;
    private String size;

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
