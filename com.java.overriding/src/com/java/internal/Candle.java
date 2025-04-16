package com.java.internal;

public class Candle {
    protected String color; // Color of the candle (e.g., red, white, blue)
    protected String size;  // Size of the candle (e.g., small, medium, large)

    // Default constructor
    public Candle() {
    }

    // Constructor to initialize variables
    public Candle(String color, String size) {
        this.color = color;
        this.size = size;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Setter for size
    public void setSize(String size) {
        this.size = size;
    }

    public void lightUp() {
        System.out.println("The candle is lit.");
    }
    @Override
    public String toString() {
        return "Candle Color: " + color + ", Candle Size: " + size;
    }
}
