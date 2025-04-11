package com.java.external.Airconditioner;

import com.java.internal.Moon;

public class FullMoon extends Moon {
    public FullMoon() {
        System.out.println("No-argument constructor in FullMoon");
    }

    public void glow() {
        System.out.println("The full moon glows brightly in the night sky.");
    }

    public void hide() {
        System.out.println("The full moon is setting.");
    }

    public void hide(Moon moon) {
        if (moon != null) {
            System.out.println("The moon is being eclipsed.");
        } else {
            System.out.println("No moon to hide.");
        }
    }
}
