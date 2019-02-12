package com.taikang.ribbon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 
 * @author qiaodongjie
 * @date 2019年2月12日 下午2:02:04
 *
 */
@Configuration
public class RibbonConfig {

	@Bean
	public IRule ribbonRule() {
		System.out.println("self defindnation  ribbon rule");
		return new RandomRule();
	}
}
