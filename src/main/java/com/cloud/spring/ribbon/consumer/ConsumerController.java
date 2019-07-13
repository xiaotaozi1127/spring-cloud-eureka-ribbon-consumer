package com.cloud.spring.ribbon.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HelloService helloService;

    @GetMapping("/ribbon-consumer")
    public String helloConsumer(){
        return helloService.helloService();
    }
}
