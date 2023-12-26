package com.stevemuish.restapi001.Contorllers;

import com.stevemuish.restapi001.models.VendorModel;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class VendorInfoManagementController {


    @GetMapping("/vendor-info/{id}")
    public ResponseEntity<Object> getVendorInfo(@PathVariable String id)
    {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/vendor-info")
    public ResponseEntity<Object> getName(@RequestParam( /*defaultValue = "stephen"*/ required = true)
                                              String  name)
    {

        return new ResponseEntity<>("<h1> RedStevo " + name+"</h1>", HttpStatus.OK);
    }

    //working on post mapping. --> used to create an object.

    @PostMapping("new-vendor")
    public ResponseEntity<String> createVendor(@RequestBody VendorModel vendor)
    {
        System.out.println(vendor.getVendorName());
        return new ResponseEntity<>("Vendor creates successifully",HttpStatus.CREATED);
    }


    
}

