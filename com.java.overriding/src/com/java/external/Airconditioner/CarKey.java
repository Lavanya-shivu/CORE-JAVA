package com.java.external.Airconditioner;

import com.java.internal.Key;

public class CarKey {
    public void carKey(Key key
    ) {
        if (key != null) {
            System.out.println("Key gives security!");

            if (key instanceof HouseKey) {
                HouseKey houseKey = (HouseKey) key;
                houseKey.unlock();
                houseKey.twist();
            } else {
                key.insert();
                System.err.println("This is a carkey.");
            }
        } else {
            System.err.println("Key is null.");
        }
    }
}
