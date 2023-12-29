package com.stevemuish.restapi001.repository;

import com.stevemuish.restapi001.models.VendorModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class RepositoryConfig {

    @Bean
    public JdbcTemplate jdbcTemplate()
    {
        System.out.println("Creating Database Connection...");
        return new JdbcTemplate(dataSource()); //creating the database connection.

    }

    @Bean
    public DriverManagerDataSource dataSource()
    {

        String url = "jdbc:mariadb://127.0.0.1:3306/rest_api_practice";

        String username = "steve";

        String password = "sijui!";

        System.out.println("Configuring the data source...");

        return new DriverManagerDataSource(url, username, password);

    }

    @Bean
    public VendorModel vendorModel()
    {
        return new VendorModel();
    }

}
