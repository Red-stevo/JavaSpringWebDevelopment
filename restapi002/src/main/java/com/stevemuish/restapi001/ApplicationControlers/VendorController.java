package com.stevemuish.restapi001.ApplicationControlers;

import com.stevemuish.restapi001.ApplicationModels.VendorModel;
import com.stevemuish.restapi001.VendorRepository.VendorOperationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/shop")
public class VendorController {

    //creating a new Vendor.
    @PostMapping("/register")
    public ResponseEntity<String> createVendor(@RequestBody Map<String,
            Object> vendorMap)
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
                    
                    \t\tReceived a Http get request
                    
                    """);
        }

        vendorModel = vendorOperationsRepository.getVendor(vendorId);
        return new ResponseEntity<>(vendorModel, HttpStatus.OK);
    }

    //Deleting a vendor
    @DeleteMapping("/delete-vendor/{vendorId}")
    public ResponseEntity<String> deleteVendor(@PathVariable String vendorId)
    {
        {
            System.out.println("""
                    
                    \t\tdeleteVendor(@PathVariable String vendorId)
                    \t\tReceive a delete user request...
                    
                    """);
        }

        vendorOperationsRepository.deleteVendor(vendorId);

        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }


    @PutMapping("/update/{vendorPath}")
    public ResponseEntity<String> updateUserData(
            @PathVariable String vendorPath, @RequestParam String value)
    {
        vendorOperationsRepository.updateVendorData(vendorPath, value);
        return new ResponseEntity<>("Update successful", HttpStatus.OK);
    }


    VendorOperationsRepository vendorOperationsRepository;

    @Autowired
    public void setVendorOperationsRepository(VendorOperationsRepository
                                                          vendorOperationsRepository) {
        this.vendorOperationsRepository = vendorOperationsRepository;
    }

    VendorModel vendorModel;

    @Autowired
    public void setVendorModel(VendorModel vendorModel) {
        this.vendorModel = vendorModel;
    }
}
