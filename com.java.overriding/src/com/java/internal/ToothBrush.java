package com.java.internal;

public class ToothBrush {
    private String brand;
    private String color;

    public ToothBrush(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void clean() {
        System.out.println("Brushing teeth with a regular toothbrush.");
    }
    @Override
    public String toString() {
        return "ToothBrush [Brand: " + brand + ", Color: " + color + "]";
    }
}
