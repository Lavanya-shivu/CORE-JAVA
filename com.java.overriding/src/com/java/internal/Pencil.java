package com.java.internal;

public class Pencil {
    private String brand;
    private double length;

    public Pencil() {
    }

    public Pencil(String brand) {
        this.brand = brand;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void draw() {
        System.out.println("Drawing with a pencil.");
    }
    @Override
    public String toString() {
        return "Pencil [Brand: " + brand + ", Length: " + length + " cm]";
    }
}
