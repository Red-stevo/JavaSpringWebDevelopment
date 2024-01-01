package com.stevemuish.restapi001.ApplicationModels;

import org.springframework.stereotype.Component;

@Component
public class VendorModel {

    private String VendorName;

    private String VendorId;

    private String VendorAddress;

    private String VendorPhoneNumber;


    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getVendorId() {
        return VendorId;
    }

    public void setVendorId(String vendorId) {
        VendorId = vendorId;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        VendorPhoneNumber = vendorPhoneNumber;
    }

    public String toString()
    {
        return  "\n\tvendor id : "+VendorId+
                "\n\tVendor Name : "+VendorName+
                "\n\tVendor Address : "+VendorAddress+
                "\n\tVendor Phone No. : "+VendorPhoneNumber;
    }
}
