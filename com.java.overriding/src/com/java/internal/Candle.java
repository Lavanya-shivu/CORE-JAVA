package com.java.internal;

public class Candle {
    private String color;
    private String size;

    // Default constructor
    public Candle() {
    }

    public Candle(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

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
