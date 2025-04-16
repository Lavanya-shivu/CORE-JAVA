package com.java.internal;

public class Cake {

    protected String flavor;
    protected String size;

    // Default constructor
    public Cake() {
    }

    // Constructor to initialize variables
    public Cake(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
    }

    // Setter for flavor
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
