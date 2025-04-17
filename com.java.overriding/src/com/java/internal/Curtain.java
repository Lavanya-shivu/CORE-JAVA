package com.java.internal;

public class Curtain {
    private String color;
    private String material;

    public Curtain() {
    }

    public Curtain(String color, String material) {
        this.color = color;
        this.material = material;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void open() {
        System.out.println("Opening the curtain.");
    }
    @Override
    public String toString() {
        return "Curtain Color: " + color + ", Material: " + material;
    }
}
