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
    public void createVendor(Object[] vendorObject) {

    }

    @Override
    public void updateVendor(String vendorId, Object[] vendorObject) {

    }

}
