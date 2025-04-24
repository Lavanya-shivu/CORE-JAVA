package com.java.internal;

public class EmailNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("email Notification");
    }
}