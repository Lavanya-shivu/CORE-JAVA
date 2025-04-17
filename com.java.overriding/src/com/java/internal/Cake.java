package com.java.internal;

public class Cake {

    private String flavor;
    private String size;

    public Cake() {
    }

    public Cake(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void bake() {
        System.out.println("Baking a classic cake!");
    }
    @Override
    public String toString() {
        return "Cake Flavor: " + flavor + ", Cake Size: " + size;
    }
}
