package com.java.internal;

public class Carpet {
    private String material;
    private String color;

    public Carpet() {
    }

    public Carpet(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void layDown() {
        System.out.println("Carpet is laid on the floor");
    }
    @Override
    public String toString() {
        return "Carpet Material: " + material + ", Carpet Color: " + color;
    }
}
