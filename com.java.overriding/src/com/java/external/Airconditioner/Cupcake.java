package com.java.external.Airconditioner;

import com.java.internal.Cake;

public class Cupcake extends Cake {
    public Cupcake() {
        System.out.println("No-argument constructor in BirthdayCake");
    }

    public void decorate() {
        System.out.println("Decorating cake with frosting and sprinkles!");
    }

    public void slice() {
        System.out.println("Cutting the birthday cake into slices!");
    }

    public void slice(Cake cake) {
        if (cake != null) {
            System.out.println("Sharing the delicious cake!");
        } else {
            System.out.println("No cake to slice.");
        }
    }
}
