package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoController {
    private Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private Service2Gateway service2Gateway;

    @GetMapping("/hi")
    public String sayHi(){
        logger.info("Hello log");
        String result = service2Gateway.call();
        return "Hello spring boot 3 with " + result;
    }
}
