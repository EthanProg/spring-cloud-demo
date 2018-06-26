package com.example.demo.business;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liwenqing on 2018/6/26.
 */
@RestController
public class TestController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(){
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("/hell0, host: " + instance.getHost() + ", service_id: " + instance.getServiceId());
        return "Hello Wolrd";
    }

    @RequestMapping("/test")
    public String test(){
        return "Spring Boot";
    }
}
