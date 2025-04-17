package com.java.internal;

public class Window {
    private String material;
    private String size;

    public Window(String material, String size) {
        this.material = material;
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void open() {
        System.out.println("Opening the window.");
    }
    @Override
    public String toString() {
        return "Window [Material: " + material + ", Size: " + size + "]";
    }
}
