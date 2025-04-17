package com.java.internal;

public class Detergent {
    private String brand;
    private String type;

    public Detergent() {
    }

    public Detergent(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void foam() {

        System.out.println("Creating foam to clean clothes.");
    }
    @Override
    public String toString() {
        return "Detergent Brand: " + brand + ", Type: " + type;
    }
}
