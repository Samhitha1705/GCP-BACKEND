package com.accesshr.emsbackend.Entity;

public enum CountryServerConfig {

    UK("java-backend-460409:us-central1:multitenant-db", "root", "Dhanush@123456"),
    INDIA("java-backend-460409:us-central1:multitenant-db", "root", "Dhanush@123456");

    private final String serverUrl;
    private final String dbUsername;
    private final String dbPassword;

    CountryServerConfig(String serverUrl, String dbUsername, String dbPassword) {
        this.serverUrl = serverUrl;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    @Override
    public String toString() {
        return "CountryServerConfig{" +
                "serverUrl='" + serverUrl + '\'' +
                ", dbUsername='" + dbUsername + '\'' +
                ", dbPassword='" + dbPassword + '\'' +
                '}';
    }
}
