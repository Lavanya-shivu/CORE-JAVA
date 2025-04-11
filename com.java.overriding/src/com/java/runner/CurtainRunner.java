package com.java.runner;

import com.java.external.Airconditioner.AutoCurtain;

public class CurtainRunner {
    public static void main(String[] args) {
        AutoCurtain curtain = new AutoCurtain();
        curtain.open();               // Base class method
        System.out.println("--------------------------");

        curtain.adjustLight();        // Subclass method
        curtain.close();              // Subclass method
        curtain.close(curtain);       // With object
        curtain.close(null);          // With null
        System.out.println("==========================");
    }
}
