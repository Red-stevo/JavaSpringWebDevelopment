package com.stevemuish.restapi001.Configarations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.stevemuish.restapi001")
public class DataBaseConfig {

    /*
    * Create the connection by passing the data source to the
    * JdbcTemplate() constructor.
    *
    * we may also use setter to create the connection as it extends
    *  JdbcAccessor class which allows configuration by use of setter function.
    * */
    @Bean
    public JdbcTemplate jdbcTemplate()
    {
        JdbcTemplate jdbcTemplate;

        jdbcTemplate = new JdbcTemplate(data());

        {
            System.out.println("\n\t\tjdbcTemplate()" +
                    "\n\t\tConfigured the connection.....\n");
        }

        return jdbcTemplate;
    }



    /*
    *       Configuring the datasource
    *
    *   *Here we provide the database url, userName and the password,
    *   depending on the DriverManagerDataSource() constructor I have Chosen;
    *
    *   To view more class constructors, place the pointer on the
    * DriverManagerDataSource, hold on crtl and tap on the pad.
    * */

    @Bean
    public DataSource data()
    {
        DataSource dataSource;

        //Configuring the dataSource.
        dataSource = new DriverManagerDataSource("jdbc:mariadb://127.0.0.1:3306/rest_api_practice",
                "steve", "sijui!");

        {
            System.out.println("\t\tdata()\n" +
                    "\t\tConfiguring the data source.....Done..");
        }
        return dataSource;
    }
}
