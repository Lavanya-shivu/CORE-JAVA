package com.java.internal;

public class Pot {
    private String material;
    private int size;

    public Pot(String material) {
        this.material = material;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void soil() {
        System.out.println("soil in a pot");
    }
    @Override
    public String toString() {
        return "Pot [Material: " + material + ", Size: " + size + "]";
    }
}
