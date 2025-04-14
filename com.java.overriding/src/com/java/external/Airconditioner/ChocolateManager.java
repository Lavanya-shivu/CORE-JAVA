package com.java.external.Airconditioner;

import com.java.internal.Chocolate;

public class ChocolateManager {
    public void manage(Chocolate chocolate) {
        if (chocolate != null) {
            System.out.println("Managing the chocolate...");

            if (chocolate instanceof DarkChocolate) {
                DarkChocolate darkChocolate = (DarkChocolate) chocolate;
                darkChocolate.melt();
                darkChocolate.bitterNote();
            } else {
                chocolate.taste();
                System.out.println("Enjoying the sweet taste of chocolate.");
            }
        } else {
            System.err.println("No chocolate to manage.");
        }
    }
}
