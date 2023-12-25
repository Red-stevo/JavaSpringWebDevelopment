package com.stevemuish.restapi001.Contorllers;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class VendorInfoManagementController {

    @ResponseBody
    @GetMapping("/get-info")
    public String getVendorInfo()
    {
        return "Vendor returned here.";
    }
}
