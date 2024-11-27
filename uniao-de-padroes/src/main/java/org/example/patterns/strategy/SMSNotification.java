package org.example.patterns.strategy;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}