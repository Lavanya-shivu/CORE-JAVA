package com.java.internal;

public class Mirror {
    private String material;
    private double size;

    public Mirror() {
        this.material = "Glass";
        this.size = 10.0;
    }

    public Mirror(String material, double size) {
        this.material = material;
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void reflect() {
        System.out.println("Mirror reflects image");
    }
    @Override
    public String toString() {
        return "Mirror [Material: " + material + ", Size: " + size + " inches]";
    }
}
