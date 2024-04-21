package com.papillon.cloudconsumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import jakarta.annotation.Resource;


@RestController
public class Controller {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;
    
    @Value("${server.port}")
    private String serverport;

    // @Value("${config.info}")
    // private String configinfo;

    @GetMapping("/consumer")
    public String consumer() {
        String result = restTemplate.getForObject(serverURL + "/provider", String.class);
        return result + " consumer " + serverport;
    }
    
}
