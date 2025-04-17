package com.java.internal;

public class Sticker {
    private String type;
    private String message;

    public Sticker(String type) {
        this.type = type;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void send() {

        System.out.println("Sending a regular sticker.");
    }
    @Override
    public String toString() {
        return "Sticker [Type: " + type + ", Message: " + message + "]";
    }
}
