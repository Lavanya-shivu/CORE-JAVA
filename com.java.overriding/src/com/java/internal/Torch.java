package com.java.internal;

public class Torch {
    private String brand;
    private String color;

    public Torch(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void turnOn() {
        System.out.println("Torch is turned on.");
    }
    @Override
    public String toString() {
        return "Torch [Brand: " + brand + ", Color: " + color + "]";
    }
}
