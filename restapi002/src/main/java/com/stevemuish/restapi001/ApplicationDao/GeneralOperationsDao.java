package com.stevemuish.restapi001.ApplicationDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class GeneralOperationsDao {

    //Injecting the jdbcTemplate dependencies to perform database operation.
   JdbcTemplate jdbcTemplate;

   @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
   {
       this.jdbcTemplate = jdbcTemplate;
   }

   public void cleanVendorDetailsTable()
   {
       {
           System.out.println("\n\t\t cleanVendorDetailsTable()" +
                   "\t\tremoving all rows in VendorDetails Table");
       }

       String truncationSql =  "TRUNCATE VendorDetails";

       jdbcTemplate.execute(truncationSql);

       {
           System.out.println("\tVendorDetails cleaned up ......\n");
       }
   }

}
