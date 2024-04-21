package com.papillon.cloudprovider2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    @Value("${server.port}")
    private String serverport;

    // @Value("${config.info}")
    // private String configinfo;

    @GetMapping("/provider")
    public String provider() {
        return "provider " + serverport;
    }
    
}
