package com.example.demo.business;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface HelloServiceTwo {

    @RequestMapping("/hello")
    String hello();
}
