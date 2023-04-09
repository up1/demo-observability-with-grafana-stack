package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Service2Gateway {

    @Autowired
    private RestTemplate restTemplate;

    public String call() {
        try{
            return restTemplate.getForObject("http://target-service:8080/target", String.class);
        }catch (Exception e){
            return "Error from service";
        }
    }

}
