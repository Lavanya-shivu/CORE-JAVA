package com.java.runner;

import com.java.external.Airconditioner.LiquidDetergent;

public class DetergentRunner {
    public static void main(String[] args) {
        LiquidDetergent detergent = new LiquidDetergent();
        detergent.foam();
        System.out.println("--------------------------");

        detergent.fragrance();
        detergent.rinse();
        detergent.rinse(detergent);
        detergent.rinse(null);
        System.out.println("==========================");
    }
}
