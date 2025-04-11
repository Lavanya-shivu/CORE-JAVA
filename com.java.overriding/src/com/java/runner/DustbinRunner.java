package com.java.runner;

import com.java.external.Airconditioner.SmartDustbin;

public class DustbinRunner {
    public static void main(String[] args) {
        SmartDustbin dustbin = new SmartDustbin();
        dustbin.openLid();
        System.out.println("--------------------------");

        dustbin.detectTrash();
        dustbin.compressWaste();
        dustbin.compressWaste(dustbin);
        dustbin.compressWaste(null);
        System.out.println("==========================");
    }
}
