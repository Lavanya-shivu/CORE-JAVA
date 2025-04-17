package com.java.internal;

public class Zip {
    private String material;
    private String color;

    public Zip(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void fasten() {

        System.out.println("Fastening the zip.");
    }
    @Override
    public String toString() {
        return "Zip [Material: " + material + ", Color: " + color + "]";
    }
}
