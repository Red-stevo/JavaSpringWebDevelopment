package com.stevemuish.restapi001.VendorRepository;

import com.stevemuish.restapi001.ApplicationDao.VendorOperationDao;
import com.stevemuish.restapi001.ApplicationModels.VendorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class VendorOperationsRepository {
    VendorOperationDao vendorOperationDao;

    VendorModel vendorModel;
    @Autowired
    public void setVendorOperationDao(VendorOperationDao vendorOperationDao)throws Exception
    {
        this.vendorOperationDao = vendorOperationDao;
    }

    @Autowired
    public void setVendorModel(VendorModel vendorModel) {
        this.vendorModel = vendorModel;
    }

    public void createVendor(Map<String, Object> vendorMap) {

        {
            System.out.println(
                    "\n\t\tcreateVendor(Map<String, Object> vendorMap) method" +
                    "\t\tinserting a new vendor");
        }

        Object[] vendorObject = new Object[4];

        vendorObject[0] = vendorMap.get("VendorName");
        vendorObject[1] = vendorMap.get("VendorId");
        vendorObject[2] = vendorMap.get("VendorAddress");
        vendorObject[3] = vendorMap.get("VendorPhoneNumber");


        vendorOperationDao.insertVendor(vendorObject);
    }


    public VendorModel getVendor(String vendorId)
    {
        {
            System.out.println("""

                    \t\tVendorModel getVendor(String vendorId)
                    \t\tgetting a vendor from the database...""");
        }

        vendorModel = vendorOperationDao.getVendorById(vendorId);

        return vendorModel;
    }

    public void deleteVendor(String vendorId) {

        {
            System.out.println("""
                    
                    \t\tdeleteVendor(String vendorId)
                    \t\tdeleting a vendor.
                    
                    """);
        }

        vendorOperationDao.deleteVendorById(vendorId);

    }
}
