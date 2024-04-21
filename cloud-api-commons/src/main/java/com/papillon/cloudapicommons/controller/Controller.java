package com.papillon.cloudapicommons.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Value("${server.port}")
    private String serverport;

    @Value("${config.info}")
    private String configinfo;
    
    @GetMapping("/index")
    public String index() {
        return "index server.port = " + serverport + " config.info :" + configinfo;
    }
}
