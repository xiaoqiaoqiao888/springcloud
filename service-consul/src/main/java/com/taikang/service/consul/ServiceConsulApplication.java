package com.taikang.service.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ServiceConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsulApplication.class, args);
    }

    @RequestMapping("/hi")
    public String home() {
        return "Hi ,I'm service-consul";
    }
}
