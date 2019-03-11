package com.taikang.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RibbonService {
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "clientError")
	public String helloRibbon(String name) {
		return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name=" + name, String.class);
	}

	public String clientError(String name) {
		return "hi, " + name + " sorry ribbon error";
	}
}
