package com.java.Runner;

import com.java.external.lock.Lock;
import com.java.internal.lock.Security;

public class LockRunner {
    public static void main(String[] args) {
        System.out.println("Creating a Lock object...\n");

        Lock lock = new Lock();
        System.out.println();

        Security security = new Lock();
    }

}
