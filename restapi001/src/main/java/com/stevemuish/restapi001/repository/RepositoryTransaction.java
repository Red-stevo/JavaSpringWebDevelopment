package com.stevemuish.restapi001.repository;

import com.stevemuish.restapi001.models.VendorModel;

import java.util.ArrayList;
import java.util.List;

public interface RepositoryTransaction {

    VendorModel getVendorInfo(String vendorId); //method to return vendor object.

    String deleteVendor(String vendorId); //method to delete vendor info from the database.

    String createVendor(Object[] vendorObject); //insert a vendor id to the database.

    void updateVendor(String vendorId, Object[] vendorObject); //method to update the vendor info in the database.

}
