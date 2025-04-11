package com.java.runner;

import com.java.external.Airconditioner.Dinning;

public class CarpetRunner {
    public static void main(String[] args) {
        Dinning dinning = new Dinning();
        dinning.layDown();
        System.out.println("--------------------------");

        dinning.material();
        dinning.clean();
        dinning.clean(dinning); // with object
        dinning.clean(null);         // with null
        System.out.println("==========================");
    }
}
