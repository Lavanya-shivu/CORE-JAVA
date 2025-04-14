package com.java.external.Airconditioner;

import com.java.internal.Cake;

public class Baker {
    public void prepare(Cake cake) {
        if (cake != null) {
            System.out.println("Preparing the cake...");

            if (cake instanceof Cupcake) {
                Cupcake cupcake = (Cupcake) cake;
                cupcake.decorate();
                cupcake.slice();
            } else {
                cake.bake();
                System.out.println("Baking a classic cake.");
            }
        } else {
            System.err.println("No cake to prepare.");
        }
    }
}
