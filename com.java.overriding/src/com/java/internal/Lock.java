package com.java.internal;

public class Lock {
    private String lockType;
    private boolean isEngaged;

    public Lock() {
        this.lockType = "Unknown";
        this.isEngaged = false;
    }

    public Lock(String lockType, boolean isEngaged) {
        this.lockType = lockType;
        this.isEngaged = isEngaged;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public void setEngaged(boolean isEngaged) {
        this.isEngaged = isEngaged;
    }

    public void engage() {
        System.out.println("Lock is now engaged.");
    }
    @Override
    public String toString() {
        return "Lock [Type: " + lockType + ", Engaged: " + isEngaged + "]";
    }
}
