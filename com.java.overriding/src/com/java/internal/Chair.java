package com.java.internal;

public class Chair {
    private String material;
    private String color;

    public Chair() {
    }

    public Chair(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void sit() {
        System.out.println("Sitting on the chair.");
    }
    @Override
    public String toString() {
        return "Chair Material: " + material + ", Chair Color: " + color;
    }
}
