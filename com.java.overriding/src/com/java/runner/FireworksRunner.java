package com.java.runner;

import com.java.external.Airconditioner.ColorfulFireworks;

public class FireworksRunner {
    public static void main(String[] args) {
        ColorfulFireworks fireworks = new ColorfulFireworks();
        fireworks.explode();
        System.out.println("--------------------------");

        fireworks.colors();
        fireworks.show();
        fireworks.show(fireworks);
        fireworks.show(null);
        System.out.println("==========================");
    }
}
