package com.xtech.config;

import org.springframework.security.config.annotation.authentication.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class inMemorySecurityConfig {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder)
			throws Exception{
		builder
			.inMemoryAuthentication()
			.withUser("admin").password("{noop}342124").roles("ADMIN")
			.and()
			.withUser("henrique").password("{noop}123456").roles("USER")
			.and()
			.withUser("ranny").password("112233").roles("USER");
			
			
	}
}
