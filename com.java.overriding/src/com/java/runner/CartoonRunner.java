package com.java.runner;

import com.java.external.Airconditioner.TomAndJerry;

public class CartoonRunner {
    public static void main(String[] args) {
        TomAndJerry show = new TomAndJerry();
        show.display();                     // Inherited from Cartoon
        System.out.println("--------------------------");

        show.chase();                       // Subclass method
        show.laugh();                       // Subclass method
        show.laugh(show);                  // Pass object
        show.laugh(null);                  // Pass null
        System.out.println("==========================");
    }
}
