package com.java.internal;

public class Projector {
    private String brand;
    private int resolution;

    public Projector(String brand) {
        this.brand = brand;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void display() {
        System.out.println("Displaying visuals on the screen.");
    }
    @Override
    public String toString() {
        return "Projector [Brand: " + brand + ", Resolution: " + resolution + "p]";
    }
}
