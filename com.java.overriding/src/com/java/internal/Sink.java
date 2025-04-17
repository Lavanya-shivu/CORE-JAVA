package com.java.internal;

public class Sink {
    private String material;
    private int depth;

    public Sink(String material, int depth) {
        this.material = material;
        this.depth = depth;
    }

    public Sink() {
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void drainWater() {
        System.out.println("Water is draining from the sink.");
    }
    @Override
    public String toString() {
        return "Sink [Material: " + material + ", Depth: " + depth + " cm]";
    }
}
