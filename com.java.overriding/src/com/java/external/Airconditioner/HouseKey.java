package com.java.external.Airconditioner;

import com.java.internal.Key;

public class HouseKey extends Key {
    public HouseKey() {
        System.out.println("No-argument constructor in HouseKey");
    }

    public void twist() {
        System.out.println("Twisting the key to unlock the door.");
    }

    public void unlock() {
        System.out.println("Unlocking the door with house key.");
    }

    public void unlock(Key key) {
        if (key != null) {
            System.out.println("Door unlocked using the provided key.");
        } else {
            System.out.println("No key provided for unlocking.");
        }
    }
}
