package org.example.patterns.composite;

public class SingleNotification implements NotificationComponent {
    private String message;

    public SingleNotification(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Notification: " + message);
    }
}