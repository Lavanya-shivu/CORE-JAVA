package com.java.internal;

public class PhoneCase {
    private String material;
    private String color;

    public PhoneCase(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void protect() {
        System.out.println("Phone case protects the phone.");
    }
    @Override
    public String toString() {
        return "PhoneCase [Material: " + material + ", Color: " + color + "]";
    }
}
