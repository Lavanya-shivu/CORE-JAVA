package com.java.runner;

import com.java.external.Airconditioner.GoldenGate;

public class BridgeRunner {
    public static void main(String[] args) {
        GoldenGate bridge = new GoldenGate();
        bridge.support();
        System.out.println("--------------------------");

        bridge.landmark();
        bridge.close();
        bridge.close(bridge);
        bridge.close(null);
        System.out.println("==========================");
    }
}
