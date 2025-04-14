package com.java.external.Airconditioner;

import com.java.internal.Moon;

public class HalfMoon {
    public void halfMoon(Moon moon) {
        if (moon != null) {
            System.out.println("Moon is beautiful");

            if (moon instanceof FullMoon) {
                FullMoon fullMoon = (FullMoon) moon;
                fullMoon.glow();
                fullMoon.hide();
            } else {
                moon.rise();
                System.err.println("This is a halfmoon.");
            }
        } else {
            System.err.println("Moon is null.");
        }
    }
}
