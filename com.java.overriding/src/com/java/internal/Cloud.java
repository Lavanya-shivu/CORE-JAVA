package com.java.internal;

public class Cloud {
    private String size;
    private String color;

    public Cloud() {
    }

    public Cloud(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void floatInSky() {
        System.out.println("Cloud is floating in the sky.");
    }
    @Override
    public String toString() {
        return "Cloud Size: " + size + ", Cloud Color: " + color;
    }
}
