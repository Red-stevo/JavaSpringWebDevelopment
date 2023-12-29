package com.stevemuish.restapi001.repository;

import com.stevemuish.restapi001.models.VendorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class VendorRowMapper implements RowMapper<VendorModel> {

    @Override
    public VendorModel mapRow(ResultSet rs, int rowNum) throws SQLException {

       VendorModel vendorModel = new VendorModel();

        vendorModel.setVendorName(rs.getString("VendorName"));
        vendorModel.setVendorId(""+rs.getInt("VendorId"));
        vendorModel.setVendorAddress(rs.getString("VendorAddress"));
        vendorModel.setVendorPhoneNumber(rs.getString("VendorPhoneNumber"));

        //System.out.println(vendorModel);

        return vendorModel;
    }
}
