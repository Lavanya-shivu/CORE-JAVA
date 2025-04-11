package com.java.external.Airconditioner;

import com.java.internal.Sunglass;

public class Lenskart extends Sunglass {
    public Lenskart() {
        System.out.println("No-argument constructor in Lenskart");
    }

    public void frameStyle() {
        System.out.println("Sunglasses have a stylish aviator frame");
    }

    public void remove() {
        System.out.println("Sunglasses removed and stored safely");
    }

    public void remove(Sunglass sunglass) {
        if (sunglass != null) {
            System.out.println("Removing the sunglasses properly");
        } else {
            System.out.println("No sunglasses to remove");
        }
    }
}
