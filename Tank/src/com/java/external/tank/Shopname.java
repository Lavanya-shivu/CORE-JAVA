package com.java.external.tank;

import com.java.internal.Tank.Tank;

public class Shopname {
    public void tankShopname() {
        Tank tank = new Tank();

        // Can only use public getters from different package
        System.out.println("Brand name: " + tank.getBrand());
        System.out.println("Tank Color: " + tank.getColor());
        System.out.println("Capacity of Tank: " + tank.getCapacity());
        System.out.println("Prize of the Tank: " + tank.getPrize());
        System.out.println("Worth buying: " + tank.isWorth());

    }
}
