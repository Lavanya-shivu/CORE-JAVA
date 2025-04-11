package com.java.internal;

public class Ride extends Helmet{
    public Ride() {
        System.out.println("No-argument constructor in Ride");
    }

    public void features() {
        System.out.println("Helmet has visor, chinstrap, and ventilation");
    }

    public void secure() {
        System.out.println("Securing the helmet");
    }

    public void secure(Helmet helmet) {
        if (helmet != null) {
            System.out.println("Helmet is secured properly");
        } else {
            System.out.println("Helmet is missing");
        }
    }
}
