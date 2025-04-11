package com.java.runner;

import com.java.external.Airconditioner.Lenskart;

public class SunglassRunner {
    public static void main(String[] args) {
        Lenskart lenskart = new Lenskart();
        lenskart.wear();                   // Inherited from Sunglass
        System.out.println("--------------------------");

        lenskart.frameStyle();             // Custom method
        lenskart.remove();                 // Custom method
        lenskart.remove(lenskart);         // Pass as Sunglass
        lenskart.remove(null);            // Null check
        System.out.println("==========================");
    }
}
