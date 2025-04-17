package com.java.internal;

public class Towel {
    private String material;
    private String color;

    public Towel(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void dry() {
        System.out.println("Using towel to dry hands.");
    }
    @Override
    public String toString() {
        return "Towel [Material: " + material + ", Color: " + color + "]";
    }
}
