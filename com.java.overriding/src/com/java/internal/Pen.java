package com.java.internal;

public class Pen {
    private String color;
    private String type;

    public Pen() {
        this.color = "Black";
        this.type = "Ballpoint";
    }

    public Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void write() {
        System.out.println("Writing with the pen.");
    }
    @Override
    public String toString() {
        return "Pen [Color: " + color + ", Type: " + type + "]";
    }
}
