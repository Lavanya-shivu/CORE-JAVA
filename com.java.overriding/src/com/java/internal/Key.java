package com.java.internal;

public class Key {
    private String keyType;
    private String lockType;
    public Key() {
    }

    public Key(String keyType, String lockType) {
        this.keyType = keyType;
        this.lockType = lockType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }
    public void insert() {

        System.out.println("Inserting the key into the lock.");
    }
    @Override
    public String toString() {
        return "Key [Type: " + keyType + ", Lock: " + lockType + "]";
    }
}
