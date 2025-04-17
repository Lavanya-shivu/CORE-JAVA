package com.java.internal;

public class Leaf {
    private String leafType;
    private int size;

    public Leaf() {
    }

    public Leaf(String leafType, int size) {
        this.leafType = leafType;
        this.size = size;
    }

    public void setLeafType(String leafType) {
        this.leafType = leafType;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void photosynthesis() {
        System.out.println("Leaf is doing photosynthesis.");
    }
    @Override
    public String toString() {
        return "Leaf [Type: " + leafType + ", Size: " + size + " cm]";
    }
}
