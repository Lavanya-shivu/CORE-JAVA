package com.java.external.Airconditioner;

import com.java.internal.Carpet;

public class Dinning extends Carpet {
    public Dinning() {
        System.out.println("No-argument constructor in ObjectCarpet");
    }

    public void material() {
        System.out.println("Carpet is made of wool, cotton, or synthetic fibers");
    }

    public void clean() {
        System.out.println("Cleaning the carpet with a vacuum cleaner");
    }

    public void clean(Carpet carpet) {
        if (carpet != null) {
            System.out.println("Carpet is being professionally cleaned");
        } else {
            System.out.println("No carpet to clean");
        }
    }
}
