package com.java.external.Airconditioner;

import com.java.internal.Bridge;

public class GoldenGate extends Bridge {
    public GoldenGate() {
        System.out.println("No-argument constructor in GoldenGate");
    }

    public void landmark() {
        System.out.println("Golden Gate is a famous landmark.");
    }

    public void close() {
        System.out.println("Bridge is temporarily closed.");
    }

    public void close(Bridge bridge) {
        if (bridge != null) {
            System.out.println("Bridge is safely closed.");
        } else {
            System.out.println("No bridge available to close.");
        }
    }
}
