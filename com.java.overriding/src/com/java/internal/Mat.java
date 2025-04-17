package com.java.internal;

public class Mat {
    private String material;
    private boolean isClean;

    public Mat() {
        this.material = "Unknown";
        this.isClean = true;
    }

    public Mat(String material, boolean isClean) {
        this.material = material;
        this.isClean = isClean;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCleanStatus(boolean isClean) {
        this.isClean = isClean;
    }
    public void use() {
        System.out.println("Using the mat for exercise or rest.");
    }
    @Override
    public String toString() {
        return "Mat [Material: " + material + ", Clean: " + isClean + "]";
    }
}
