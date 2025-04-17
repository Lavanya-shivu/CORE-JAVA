package com.java.internal;

public class Glove {
    private String material;
    private String size;

    public Glove() {
    }

    public Glove(String material, String size) {
        this.material = material;
        this.size = size;
    }

    public void setMaterial(String material) {

        this.material = material;
    }

    public void setSize(String size) {

        this.size = size;
    }
    public void wear() {

        System.out.println("Wearing gloves to keep hands warm.");
    }
    @Override
    public String toString() {
        return "Glove [Material: " + material + ", Size: " + size + "]";
    }
}
