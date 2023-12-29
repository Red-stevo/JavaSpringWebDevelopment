package com.stevemuish.restapi001.Services;

import com.stevemuish.restapi001.models.VendorModel;
import com.stevemuish.restapi001.repository.VendorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetVendorInfoService {
    VendorDAO vendorDAO;

    @Autowired
    public void setVendorDAO(VendorDAO vendorDAO) {
        this.vendorDAO = vendorDAO;
    }

    public VendorModel getVendor(String vendorId) {

        System.out.println("In the getVendor method");

        return vendorDAO.getVendorInfo(vendorId);}

    public String deleteVendor(String id)
    {
        return vendorDAO.deleteVendor(id);
    }

}
