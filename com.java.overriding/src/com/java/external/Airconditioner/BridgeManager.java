package com.java.external.Airconditioner;

import com.java.internal.Bridge;

public class BridgeManager {
    public void manageBridge(Bridge bridge) {
        if (bridge != null) {
            System.out.println("Managing the bridge...");

            if (bridge instanceof GoldenGate) {
                GoldenGate goldenGate = (GoldenGate) bridge;
                goldenGate.landmark();
                goldenGate.close();
            } else {
                bridge.support();
                System.out.println("Managing a basic bridge.");
            }
        } else {
            System.err.println("No bridge available to manage.");
        }
    }
}
