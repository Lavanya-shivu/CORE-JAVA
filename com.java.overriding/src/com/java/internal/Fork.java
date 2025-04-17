package com.java.internal;

public class Fork {
    private String material;
    private int size;

    public Fork() {
    }

    public Fork(String material, int size) {
        this.material = material;
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void display() {
        System.out.println("This fork is made of " + material + " and its size is " + size + " cm.");
    }
    public void use() {
        System.out.println("Using the fork to eat.");
    }
}
