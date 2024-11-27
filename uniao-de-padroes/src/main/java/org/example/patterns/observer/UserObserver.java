package org.example.patterns.observer;

public class UserObserver implements Observer {
    private String userName;

    public UserObserver(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println(userName + " received: " + message);
    }
}