package com.java.runner;

import com.java.external.Airconditioner.BathTub;

public class TubRunner {
    public static void main(String[] args) {
        BathTub tub = new BathTub();
        tub.fill();
        System.out.println("--------------------------");

        tub.drain();
        tub.clean();
        tub.clean(tub);
        tub.clean(null);
        System.out.println("==========================");
    }
}
