package com.java.internal;

public class Galaxy {
    private String type;
    private double size;

    public Galaxy() {
    }

    public Galaxy(String type, double size) {
        this.type = type;
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void display() {
        System.out.println("This is a " + type + " galaxy, and it spans " + size + " light years.");
    }
    public void rotate() {
        System.out.println("The galaxy is rotating slowly.");
    }
    @Override
    public String toString() {
        return "Galaxy [Type: " + type + ", Size: " + size + " light years]";
    }
}
