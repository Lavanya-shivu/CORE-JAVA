package com.java.external.Airconditioner;

import com.java.internal.Snow;

public class SnowFall extends Snow {
    public SnowFall() {
        System.out.println("No-argument constructor in SnowFall");
    }

    public void beauty() {
        System.out.println("Snowfall makes the scenery beautiful.");
    }

    public void melt() {
        System.out.println("Snow is melting as temperature rises.");
    }

    public void melt(Snow snow) {
        if (snow != null) {
            System.out.println("Snow melted completely.");
        } else {
            System.out.println("No snow to melt.");
        }
    }
}
