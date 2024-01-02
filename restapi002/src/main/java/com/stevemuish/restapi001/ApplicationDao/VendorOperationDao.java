package com.stevemuish.restapi001.ApplicationDao;

import com.stevemuish.restapi001.ApplicationModels.VendorModel;
import org.apache.tomcat.Jar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class VendorOperationDao {

    JdbcTemplate jdbcTemplate;

    VendorModel vendorModel;

    @Autowired
    public void setVendorModel(VendorModel vendorModel) {
        this.vendorModel = vendorModel;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) throws Exception
    {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void insertVendor(Object[] vendorObject){
        {
            System.out.println("\n\t\tinsertVendor(Map<String, Object> vendorMap) " +
                    "\t\tInserting a new vendor to the database...\n");
        }

        String insertionSql = "INSERT INTO VendorDetails VALUES(?,?,?,?)";

        int noOfRowAffected = jdbcTemplate.update(insertionSql, vendorObject);

        {
            //Log info to the console.
            System.out.println("\n\t\tInserted a new vendor to the " +
                    "database.\n"+noOfRowAffected+" Row Affected");
        }
    }


    public VendorModel getVendorById(String vendorId) {

        //logging information to the console.
        {
            System.out.println("""
                    
                    \t\tgetVendorById(String vendorId)
                    \t\tgetting data from the database...
                    
                    """);
        }
        String selectSql = "SELECT * FROM VendorDetails WHERE VendorId = ?";

        vendorModel = jdbcTemplate.queryForObject(selectSql, new BeanPropertyRowMapper<>(VendorModel.class),vendorId);

        return vendorModel;
    }

    public void deleteVendorById(String vendorId) {

        {
            System.out.println("""
                    
                    \t\tdeleteVendorById(String vendorId)
                    \t\tremoving vendor from the database.
                    
                    """);
        }

        String deletionSql = "DELETE FROM VendorDetails WHERE VendorId = ?";

       int noOfRowsAffected = jdbcTemplate.update(deletionSql,vendorId);

        System.out.println("""
                
                \t\tDeletion successful
                \t\t"""+noOfRowsAffected+ """ 
                Rows Affected.
                
                """);
    }
}
