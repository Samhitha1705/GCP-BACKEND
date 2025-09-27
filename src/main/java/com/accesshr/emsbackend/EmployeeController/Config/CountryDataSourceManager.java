package com.accesshr.emsbackend.EmployeeController.Config;

import com.zaxxer.hikari.HikariDataSource;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryDataSourceManager {

    private final Map<String, DataSource> dataSources = new HashMap<>();

    @PostConstruct
    public void init() {
        dataSources.put("UK", createDataSource("java-backend-460409:us-central1:multitenant-db", "root", "Dhanush@123456"));
        dataSources.put("INDIA", createDataSource("java-backend-460409:us-central1:multitenant-db", "root", "Dhanush@123456"));
    }

    private DataSource createDataSource(String url, String username, String password) {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:mysql://" + url + ":3306");
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return ds;
    }

    public DataSource getDataSourceForCountry(String country) {
        return dataSources.get(country.toUpperCase());
    }
}

