package com.java.internal;

public class Broom {
    private String material;
    private String type;

    // Default constructor
    public Broom() {
    }

    public Broom(String material, String type) {
        this.material = material;
        this.type = type;
    }

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
