package com.central.academy.basic_api.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic-api")
public class BasicApiController {

    private Logger LOG=Logger.getLogger(BasicApiController.class);

    @GetMapping(value = "/gretings")
    String sayHello(){
        return "Hello from Basic Api";
    }
}
