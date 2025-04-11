package com.java.internal;

public class Handbag extends Bag{
    public Handbag() {
        System.out.println("No-argument constructor in Handbag");
    }

    public void items() {
        System.out.println("Bag contains items");
    }

    public void pack() {
        System.out.println("Packing items into the bag");
    }

    public void pack(Bag bag) {
        if (bag != null) {
            System.out.println("Bag is packed properly");
        } else {
            System.out.println("No bag to pack");
        }
    }
}
