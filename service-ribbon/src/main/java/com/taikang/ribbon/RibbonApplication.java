package com.taikang.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.taikang.ribbon.config.RibbonConfig;

/**
 * 
 * @author qiaodj
 * @date 2017年7月13日
 * @version 1.0
 */
@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
@RibbonClient(name = "self.ribbon-rule", configuration = RibbonConfig.class)
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
