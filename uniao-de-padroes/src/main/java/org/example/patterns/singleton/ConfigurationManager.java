package org.example.patterns.singleton;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String systemName = "NotificationSystem";

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) instance = new ConfigurationManager();
        return instance;
    }

    public String getSystemName() {
        return systemName;
    }
}