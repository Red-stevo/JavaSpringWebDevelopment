package com.redstevo.code.springsecurity.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class RepositoryConfig {

    @Bean
    public JdbcTemplate jdbcTemplate()
    {
        {
            System.out.println("Configuring the database");
        }
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public DataSource dataSource()
    {
        String url = "jdbc:mariadb://127.0.0.1:3306/security";
        String username = "steve";
        String password = "sijui!";

        return new DriverManagerDataSource(url, username, password);
    }
}
