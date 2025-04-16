package com.java.internal;

public class Button {
    protected String size;  // Size of the button (e.g., small, medium, large)
    protected String color; // Color of the button (e.g., red, blue, green)

    // Default constructor
    public Button() {
    }

    // Constructor to initialize variables
    public Button(String size, String color) {
        this.size = size;
        this.color = color;
    }

    // Setter for size
    public void setSize(String size) {
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void attach() {
        System.out.println("Button is stitched to the fabric.");
    }
    @Override
    public String toString() {
        return "Button Size: " + size + ", Button Color: " + color;
    }
}
