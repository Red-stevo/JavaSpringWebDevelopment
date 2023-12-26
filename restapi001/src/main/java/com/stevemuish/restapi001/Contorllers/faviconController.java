package com.stevemuish.restapi001.Contorllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/favicon.ico")
public class faviconController {

    @GetMapping("")
    public ResponseEntity<String> favicon()
    {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
