package com.java.external.Airconditioner;

import com.java.internal.Glove;

public class SurgicalGlove {
    public void surgicalGlove(Glove glove) {
        if (glove != null) {
            System.out.println("Glove is ready to wera");

            if (glove instanceof LeatherGlove) {
                LeatherGlove leatherGlove = (LeatherGlove) glove;
                leatherGlove.material();
                leatherGlove.remove();
            } else {
                glove.wear();
                System.err.println("This is a leather gloves.");
            }
        } else {
            System.err.println("Glove is null.");
        }
    }
}
