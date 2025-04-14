package com.java.external.Airconditioner;

import com.java.internal.Snow;

public class SnowMan {
    public void snowMan(Snow snow) {
        if (snow != null) {
            if (snow instanceof SnowFall) {
                SnowFall snowFall = (SnowFall) snow;
                snowFall.beauty();
                snowFall.melt();
            } else {

                snow.freeze();
                System.err.println("Snow is falling");
            }
        } else {
System.err.println("Snow is null");
        }
    }
}