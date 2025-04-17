package com.java.internal;

public class Chocolate {
    private String flavor;
    private int quantity;


    public Chocolate() {
    }

    public Chocolate(String flavor, int quantity) {
        this.flavor = flavor;
        this.quantity = quantity;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public void taste() {
        System.out.println("Chocolate tastes sweet and delightful!");
    }
    @Override
    public String toString() {
        return "Chocolate Flavor: " + flavor + ", Quantity: " + quantity + "g";
    }
}
