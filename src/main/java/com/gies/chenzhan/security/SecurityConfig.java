package com.gies.chenzhan.security;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configAuthBuilder(AuthenticationManagerBuilder builder) throws Exception{
		builder
		       .inMemoryAuthentication()
		       .withUser("username").password("password").roles("users");
		
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	  http.authorizeRequests()
		.antMatchers("/role/**").access("hasRole('ROLE_ADMIN')")
		.and().formLogin();
		
	}
	


}
