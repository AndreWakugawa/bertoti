package org.example.patterns.observer;

public class NotificationService extends Observable {
    public void sendNotification(String message) {
        notifyObservers(message);
    }
}