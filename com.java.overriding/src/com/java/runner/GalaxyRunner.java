package com.java.runner;

import com.java.external.Airconditioner.MilkyWay;

public class GalaxyRunner {
    public static void main(String[] args) {
        MilkyWay galaxy = new MilkyWay();
        galaxy.rotate();
        System.out.println("--------------------------");

        galaxy.spiralArms();
        galaxy.collapse();
        galaxy.collapse(galaxy);
        galaxy.collapse(null);
        System.out.println("==========================");
    }
}
