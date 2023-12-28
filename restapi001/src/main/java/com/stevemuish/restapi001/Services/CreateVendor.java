package com.stevemuish.restapi001.Services;

import com.stevemuish.restapi001.models.VendorModel;
import com.stevemuish.restapi001.repository.VendorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateVendor {

    VendorDAO vendorDAO;

    @Autowired
    public void setVendorDAO(VendorDAO vendorDAO) {
        this.vendorDAO = vendorDAO;
    }

    public String createNewVendor(VendorModel vendorModel)
    {
        Object[] vendorObject = new Object[4];

        vendorObject[0] = vendorModel.getVendorName(); //add vendor name to the object

        vendorObject[1] = vendorModel.getVendorId(); //add the vendorId to the object

        vendorObject[2] = vendorModel.getVendorAddress(); //add the vendor address to the object

        vendorObject[3] = vendorModel.getVendorPhoneNumber(); //add vendor phone number

        String databaseResponse = vendorDAO.createVendor(vendorObject);

        return databaseResponse;
    }
}
