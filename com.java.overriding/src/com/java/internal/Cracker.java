package com.java.internal;

public class Cracker {
    private String color;
    private String size;

    public Cracker() {
    }

    public Cracker(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void light() {
        System.out.println("Lighting the cracker...");
    }
    @Override
    public String toString() {
        return "Cracker Color: " + color + ", Size: " + size;
    }
}
