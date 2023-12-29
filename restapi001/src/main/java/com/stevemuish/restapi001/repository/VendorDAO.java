package com.stevemuish.restapi001.repository;

import com.stevemuish.restapi001.models.VendorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("vendorDAO")
public class VendorDAO implements RepositoryTransaction{

   VendorRowMapper vendorRowMapper;

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setVendorRowMapper(VendorRowMapper vendorRowMapper) {
        this.vendorRowMapper = vendorRowMapper;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public VendorModel getVendorInfo(String vendorId) {
        String selectSql = "SELECT * FROM VendorDetails WHERE VendorId = "+vendorId;

        System.out.println("In the getVendorInfo");

        List<VendorModel> vendorModels;
        vendorModels = jdbcTemplate.query(selectSql, new VendorRowMapper());
       // vendorModels = jdbcTemplate.query(selectSql, vendorRowMapper);


        System.out.println(vendorModels.get(0));

        return vendorModels.get(0);
    }

    @Override
    public String deleteVendor(String vendorId) {

        String sql ="DELETE FROM VendorDetails WHERE VendorId = ?";

        //jdbcTemplate.execute(sql);

        jdbcTemplate.update(sql, vendorId);

        System.out.println(vendorId+" deleted.");

        return "Vendor Deleted successfully";
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
