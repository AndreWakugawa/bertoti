package org.example.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class NotificationGroup implements NotificationComponent {
    private List<NotificationComponent> components = new ArrayList<>();

    public void add(NotificationComponent component) {
        components.add(component);
    }

    @Override
    public void execute() {
        components.forEach(NotificationComponent::execute);
    }
}