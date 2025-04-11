package com.java.external.Airconditioner;

import com.java.internal.Tunnel;

public class MountainTunnel extends Tunnel {
    public MountainTunnel() {
        System.out.println("No-argument constructor in MountainTunnel");
    }

    public void lightsOn() {
        System.out.println("Tunnel lights are turned on.");
    }

    public void exit() {
        System.out.println("Exiting the mountain tunnel.");
    }

    public void exit(Tunnel tunnel) {
        if (tunnel != null) {
            System.out.println("Tunnel exit successful.");
        } else {
            System.out.println("No tunnel to exit from.");
        }
    }
}
