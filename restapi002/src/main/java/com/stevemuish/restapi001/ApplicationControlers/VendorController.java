package com.stevemuish.restapi001.ApplicationControlers;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stevemuish.restapi001.ApplicationModels.VendorModel;
import com.stevemuish.restapi001.VendorRepository.VendorOperationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/shop")
public class VendorController {

    //creating a new Vendor.
    @PostMapping("/register")
    public ResponseEntity<String> createVendor(@RequestBody Map<String, Object> vendorMap) throws Exception
    {

        {
            System.out.println("\n\t\tReceived a register user request....\n");
        }
        vendorOperationsRepository.createVendor(vendorMap);
        return new ResponseEntity<>("Vendor Created successfully",HttpStatus.CREATED);
    }

    @GetMapping("/login")
    public ResponseEntity<VendorModel> findVendor(@RequestParam String vendorId)
    {
        {
            System.out.println("""
                    
                    \t\tReceived a Http get request\n
                    
                    """);
        }

        vendorModel = vendorOperationsRepository.getVendor(vendorId);
        return new ResponseEntity<>(vendorModel, HttpStatus.OK);
    }


    VendorOperationsRepository vendorOperationsRepository;

    @Autowired
    public void setVendorOperationsRepository(VendorOperationsRepository vendorOperationsRepository) {
        this.vendorOperationsRepository = vendorOperationsRepository;
    }

    VendorModel vendorModel;

    @Autowired
    public void setVendorModel(VendorModel vendorModel) {
        this.vendorModel = vendorModel;
    }
}
