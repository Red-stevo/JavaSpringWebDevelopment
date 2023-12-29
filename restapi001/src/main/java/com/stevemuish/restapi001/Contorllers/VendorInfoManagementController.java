package com.stevemuish.restapi001.Contorllers;

import com.stevemuish.restapi001.Services.CreateVendor;
import com.stevemuish.restapi001.Services.GetVendorInfoService;
import com.stevemuish.restapi001.models.VendorModel;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTMLDocument;

@RestController
@RequestMapping("/vendor")
public class VendorInfoManagementController {

    CreateVendor createVendor;

    @Autowired
    public void setCreateVendor(CreateVendor createVendor) {
        this.createVendor = createVendor;
    }


    GetVendorInfoService getVendorInfoService;

    @Autowired
    public void setGetVendorInfoService(GetVendorInfoService getVendorInfoService) {
        this.getVendorInfoService = getVendorInfoService;
    }

    @GetMapping("/vendor-info/{id}")
    public ResponseEntity<VendorModel> getVendorInfo(@PathVariable String id)
    {
        System.out.println("In the get mapping.");
        VendorModel vendorModel = getVendorInfoService.getVendor(id);


        return new ResponseEntity(vendorModel, HttpStatus.OK);
    }

    @GetMapping("/vendor-info")
    public ResponseEntity<Object> getName(@RequestParam( /*defaultValue = "stephen" required = true*/)
                                              String  name, String id)
    {

        return new ResponseEntity<>("<h1> RedStevo " + name+"</h1>", HttpStatus.OK);
    }

    //working on post mapping. --> used to create an object.

    @PostMapping("/new-vendor")
    public ResponseEntity<String> createVendor(@RequestBody VendorModel vendor)
    {
        String response = createVendor.createNewVendor(vendor);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }


    @PutMapping("/rename")
    public ResponseEntity<String> updateVendor(@RequestParam() String vendorId,
                                               @RequestBody() VendorModel vendorModel)
    {
        System.out.println(vendorModel.getVendorName());
        return new ResponseEntity<>("Update successful for id "+vendorId,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{vendorId}")
    public ResponseEntity<String> deleteVendor(@PathVariable() String vendorId)
    {
        String response = getVendorInfoService.deleteVendor(vendorId);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
}

