package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HelloService helloService;

    @RequestMapping("/ribbon-consumer")
    public String helloConsumer(){
//        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();

        return helloService.helloService();
    }
}
