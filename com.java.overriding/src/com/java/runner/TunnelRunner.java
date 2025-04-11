package com.java.runner;

import com.java.external.Airconditioner.MountainTunnel;

public class TunnelRunner {
    public static void main(String[] args) {
        MountainTunnel tunnel = new MountainTunnel();
        tunnel.enter();
        System.out.println("--------------------------");

        tunnel.lightsOn();
        tunnel.exit();
        tunnel.exit(tunnel);
        tunnel.exit(null);
        System.out.println("==========================");
    }
}
