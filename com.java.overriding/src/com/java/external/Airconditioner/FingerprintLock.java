package com.java.external.Airconditioner;


import com.java.internal.Lock;

public class FingerprintLock {
    public void fingerprintLock(Lock lock) {
        if (lock != null) {
            System.out.println("Lock is scurity!");

            if (lock instanceof SmartLock) {
                SmartLock smartLock = (SmartLock) lock;
                smartLock.scanFingerprint();
                smartLock.unlock();
            } else {
                lock.engage();
                System.err.println("This is a FingerPrint Lock.");
            }
        } else {
            System.err.println("Lock is null.");
        }
    }
}
