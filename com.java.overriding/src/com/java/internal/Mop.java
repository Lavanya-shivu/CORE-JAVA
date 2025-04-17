package com.java.internal;

public class Mop {
    private String material;
    private int length;

    public Mop() {
        this.material = "Cotton";
        this.length = 100;
    }

    public Mop(String material, int length) {
        this.material = material;
        this.length = length;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void soak() {

        System.out.println("Soaking the mop in water.");
    }
    @Override
    public String toString() {
        return "Mop [Material: " + material + ", Length: " + length + " cm]";
    }
}
