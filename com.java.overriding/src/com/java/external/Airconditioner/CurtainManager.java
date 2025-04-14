package com.java.external.Airconditioner;

import com.java.internal.Curtain;

public class CurtainManager {
    public void handle(Curtain curtain) {
        if (curtain != null) {
            System.out.println("Handling the curtain...");

            if (curtain instanceof AutoCurtain) {
                AutoCurtain autoCurtain = (AutoCurtain) curtain;
                autoCurtain.adjustLight();
                autoCurtain.close();
            } else {
                curtain.open();
                System.out.println("Curtain is now open.");
            }
        } else {
            System.err.println("No curtain to handle.");
        }
    }
}
