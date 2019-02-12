package com.taikang.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author qiaodj
 * @date 2017年7月14日
 * @version 1.0
 */
@FeignClient(value = "eureka-client", fallback = Fallback.class) // 直接在controller层加注解也可以，不使用service层
public interface FeignService {
	@RequestMapping("/hi")
	public String hello(@RequestParam("name") String name);
}
