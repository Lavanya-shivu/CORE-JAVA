package com.java.internal;

public class Cupborad {
    private String material;
    private String size;

    public Cupborad() {
    }
    public Cupborad(String material, String size) {
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
        System.out.println("Cupboard is opened");
    }
    @Override
    public String toString() {
        return "Cupboard Material: " + material + ", Size: " + size;
    }
}
