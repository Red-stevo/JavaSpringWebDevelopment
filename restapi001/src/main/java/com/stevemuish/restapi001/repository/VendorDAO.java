package com.stevemuish.restapi001.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("vendorDAO")
public class VendorDAO implements RepositoryTransaction{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Object[] getVendorInfo(String vendorId) {
        return new Object[0];
    }

    @Override
    public void deleteVendor(String vendorId) {

    }

    @Override
    public String createVendor(Object[] vendorObject) {
        String sql = "INSERT INTO VendorDetails VALUES (?, ?, ?, ?)";

        int numberOfRowsAffected = jdbcTemplate.update(sql, vendorObject);

        return "Vendor creation successful, "+numberOfRowsAffected+" Rows Affected.";
    }

    @Override
    public void updateVendor(String vendorId, Object[] vendorObject) {

    }

}
