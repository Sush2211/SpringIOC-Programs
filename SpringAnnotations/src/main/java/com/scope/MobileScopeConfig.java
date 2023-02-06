package com.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class MobileScopeConfig {
	
	@Bean
	public Mobile mobile() {
		return new Mobile();
	}

}
