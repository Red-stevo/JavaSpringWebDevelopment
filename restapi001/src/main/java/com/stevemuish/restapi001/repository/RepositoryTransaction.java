package com.stevemuish.restapi001.repository;

import java.util.ArrayList;

public interface RepositoryTransaction {

    Object[] getVendorInfo(String vendorId); //method to return vendor object.

    void deleteVendor(String vendorId); //method to delete vendor info from the database.

    String createVendor(Object[] vendorObject); //insert a vendor id to the database.

    void updateVendor(String vendorId, Object[] vendorObject); //method to update the vendor info in the database.

}
