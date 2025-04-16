package com.java.internal;

public class Broom {
    protected String material; // Material of the broom (e.g., plastic, wood)
    protected String type; // Type of broom (e.g., regular, industrial)

    // Default constructor
    public Broom() {
    }

    // Constructor to initialize variables
    public Broom(String material, String type) {
        this.material = material;
        this.type = type;
    }

    // Setter for material
    public void setMaterial(String material) {
        this.material = material;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }
    public void sweep() {

        System.out.println("Sweeping the floor using a regular broom.");
    }
    @Override
    public String toString() {
        return "Broom Material: " + material + ", Broom Type: " + type;
    }
}
