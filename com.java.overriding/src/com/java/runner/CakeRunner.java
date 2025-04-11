package com.java.runner;
import com.java.external.Airconditioner.Cupcake;
public class CakeRunner {
    public static void main(String[] args) {
        Cupcake cupcake = new Cupcake();
        cupcake.bake();                  // From base class
        System.out.println("--------------------------");

        cupcake.decorate();             // Own method
        cupcake.slice();                // Own method
        cupcake.slice(cupcake);    // With object
        cupcake.slice(null);            // With null
        System.out.println("==========================");
    }
}
