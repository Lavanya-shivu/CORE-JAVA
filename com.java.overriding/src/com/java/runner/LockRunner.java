package com.java.runner;

import com.java.external.Airconditioner.SmartLock;

public class LockRunner {
    public static void main(String[] args) {
        SmartLock lock = new SmartLock();
        lock.engage();
        System.out.println("--------------------------");

        lock.scanFingerprint();
        lock.unlock();
        lock.unlock(lock);
        lock.unlock(null);
        System.out.println("==========================");
    }
}
