package com.java.internal;

public class Scarf {
    private String color;
    private String material;

    public Scarf(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void wrap() {
        System.out.println("Wrapping the scarf around the neck.");
    }
    @Override
    public String toString() {
        return "Scarf [Color: " + color + ", Material: " + material + "]";
    }
}
