package com.java.internal;

public class Candy {
    protected String flavor;  // Flavor of the candy (e.g., chocolate, mint, caramel)
    protected String type;    // Type of candy (e.g., hard, soft, chewy)

    // Default constructor
    public Candy() {
    }

    // Constructor to initialize variables
    public Candy(String flavor, String type) {
        this.flavor = flavor;
        this.type = type;
    }

    // Setter for flavor
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void make() {
        System.out.println("Making a basic candy!");
    }
    @Override
    public String toString() {
        return "Candy Flavor: " + flavor + ", Candy Type: " + type;
    }
}
