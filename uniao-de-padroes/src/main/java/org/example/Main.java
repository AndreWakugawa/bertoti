package org.example;

import org.example.patterns.composite.NotificationGroup;
import org.example.patterns.composite.SingleNotification;
import org.example.patterns.observer.NotificationService;
import org.example.patterns.observer.UserObserver;
import org.example.patterns.singleton.ConfigurationManager;
import org.example.patterns.strategy.EmailNotification;
import org.example.patterns.strategy.NotificationStrategy;
import org.example.patterns.strategy.SMSNotification;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        System.out.println("Starting " + config.getSystemName());

        NotificationService notificationService = new NotificationService();
        notificationService.addObserver(new UserObserver("Alice"));
        notificationService.addObserver(new UserObserver("Bob"));
        notificationService.sendNotification("System Maintenance Tonight");

        NotificationStrategy email = new EmailNotification();
        NotificationStrategy sms = new SMSNotification();
        email.send("Hello via Email!");
        sms.send("Hello via SMS!");

        NotificationGroup group = new NotificationGroup();
        group.add(new SingleNotification("System Restart at 2 AM"));
        group.add(new SingleNotification("New Feature Update!"));
        group.execute();
    }}