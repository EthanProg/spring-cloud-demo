package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
// 启动服务注册中心 Eureka服务端
//@EnableEurekaServer
// 自动化配置 注册为Eureka客户端应用
@EnableDiscoveryClient
// 开启断路器功能
@EnableCircuitBreaker
// 开启Hystrix Dashboard功能
@EnableHystrixDashboard
// 开启Tuibine
@EnableTurbine
public class SpringCloudDemoApplication {

	@Bean
	// 开启客户端负载均衡
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoApplication.class, args);
	}
}
