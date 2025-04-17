package com.java.internal;

public class Wheel {
    private String type;
    private int size;

    public Wheel(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void rotate() {
        System.out.println("Wheel is rotating.");
    }
    @Override
    public String toString() {
        return "Wheel [Type: " + type + ", Size: " + size + "]";
    }
}
