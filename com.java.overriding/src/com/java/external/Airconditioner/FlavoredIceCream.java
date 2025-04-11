package com.java.external.Airconditioner;

import com.java.internal.IceCream;

public class FlavoredIceCream extends IceCream {
    public FlavoredIceCream() {
        System.out.println("No-argument constructor in FlavoredIceCream");
    }

    public void scoop() {
        System.out.println("Scooping the ice cream into a cone!");
    }

    public void flavor() {
        System.out.println("Adding vanilla flavor to the ice cream!");
    }

    public void flavor(IceCream iceCream) {
        if (iceCream != null) {
            System.out.println("Ice cream is delicious and flavorful!");
        } else {
            System.out.println("No ice cream to add flavor.");
        }
    }
}
