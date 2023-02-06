package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
	@Bean
	public Demo demo() {
		return new Demo();
	}

}
