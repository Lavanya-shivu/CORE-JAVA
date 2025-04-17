package com.java.internal;

public class Button {
    private String size;
    private String color;

    public Button() {
    }

    public Button(String size, String color) {
        this.size = size;
        this.color = color;
    }

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
