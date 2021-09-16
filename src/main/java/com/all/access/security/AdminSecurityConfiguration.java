 package com.all.access.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import com.all.access.service.AdminService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class AdminSecurityConfiguration extends WebSecurityConfigurerAdapter
{
	@Autowired
	UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider adminAuthProvider()
	{
		DaoAuthenticationProvider adminAuthenticationProvider = new DaoAuthenticationProvider();
		adminAuthenticationProvider.setUserDetailsService(userDetailsService);
		adminAuthenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return adminAuthenticationProvider;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http
		.csrf().disable()
		.authorizeRequests().antMatchers("/adminlogin").permitAll()
		.and()
		.formLogin()
		.loginPage("/adminlogin").permitAll();
	}	
}
