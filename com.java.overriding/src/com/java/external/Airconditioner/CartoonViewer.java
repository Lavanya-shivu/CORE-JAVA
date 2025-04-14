package com.java.external.Airconditioner;

import com.java.internal.Cartoon;

public class CartoonViewer {
    public void watch(Cartoon cartoon) {
        if (cartoon != null) {
            System.out.println("Watching the cartoon...");

            if (cartoon instanceof TomAndJerry) {
                TomAndJerry tomAndJerry = (TomAndJerry) cartoon;
                tomAndJerry.chase();
                tomAndJerry.laugh();
            } else {
                cartoon.display();
                System.out.println("Watching a general cartoon show.");
            }
        } else {
            System.err.println("No cartoon to watch.");
        }
    }
}
