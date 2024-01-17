package com.redstevo.code.springsecurity.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> Hello()
    {
        return new ResponseEntity<>("Hello there", HttpStatus.OK);
    }
}
