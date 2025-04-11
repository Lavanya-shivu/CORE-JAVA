package com.java.external.Airconditioner;

import com.java.internal.Lock;

public class SmartLock extends Lock {
    public SmartLock() {
        System.out.println("No-argument constructor in SmartLock");
    }

    public void scanFingerprint() {
        System.out.println("Scanning fingerprint for authentication.");
    }

    public void unlock() {
        System.out.println("Smart lock has been unlocked.");
    }

    public void unlock(Lock lock) {
        if (lock != null) {
            System.out.println("Smart lock unlocked using the provided lock instance.");
        } else {
            System.out.println("No lock instance provided.");
        }
    }
}
