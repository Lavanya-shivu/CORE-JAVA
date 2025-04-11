package com.java.runner;

import com.java.external.Airconditioner.SprayMop;

public class MopRunner {
    public static void main(String[] args) {
        SprayMop sprayMop = new SprayMop();
        sprayMop.soak();
        System.out.println("--------------------------");

        sprayMop.sprayWater();
        sprayMop.cleanSurface();
        sprayMop.cleanSurface(sprayMop);
        sprayMop.cleanSurface(null);
        System.out.println("==========================");
    }
}
