package com.java.internal;

public class Fireworks {
    private String color;
    private String shape;

    public Fireworks() {
    }
    public Fireworks(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    public void explode() {
        System.out.println("Fireworks are exploding in the sky!");
    }
    @Override
    public String toString() {
        return "Fireworks Color: " + color + ", Shape: " + shape;
    }
}
