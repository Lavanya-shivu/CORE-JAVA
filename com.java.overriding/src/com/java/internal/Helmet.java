package com.java.internal;

public class Helmet {
    private String material;  // Material of the helmet
    private String size;      // Size of the helmet

    // Default constructor
    public Helmet() {
    }

    // Constructor to initialize material and size
    public Helmet(String material, String size) {
        this.material = material;
        this.size = size;
    }

    // Setters for material and size
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void protect() {
        System.out.println("Helmet provides protection");
    }
    @Override
    public String toString() {
        return "Helmet [Material: " + material + ", Size: " + size + "]";
    }
}
