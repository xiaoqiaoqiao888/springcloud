package com.taikang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 
 * @author qiaodongjie
 * @date 2019年2月12日 下午2:02:04
 *       配置在@Component下所有的ribbonclient都共享配置，所以ribbon配置要单独建包或者componentScan指定包，排除ribbon配置类的包
 */
@Configuration
public class RibbonConfig {

	@Bean
	public IRule ribbonRule() {
		System.out.println("self defindnation  ribbon rule");
		return new RandomRule();
		// return new RetryRule();
	}
}
