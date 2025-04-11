package com.java.runner;

import com.java.external.Airconditioner.SilkScarf;

public class ScarfRunner {
    public static void main(String[] args) {
        SilkScarf scarf = new SilkScarf();
        scarf.wrap();
        System.out.println("--------------------------");

        scarf.style();
        scarf.fold();
        scarf.fold(scarf);
        scarf.fold(null);
        System.out.println("==========================");
    }
}
