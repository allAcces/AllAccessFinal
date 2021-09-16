package com.all.access.security;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;

//@Configuration
//@EnableWebSecurity
public class AllAccessDemoSecurityConfig extends WebSecurityConfigurerAdapter
{
//	@Bean
//	@Override
//	protected UserDetailsService userDetailsService() 
//	{
//		List<UserDetails> userDetails = new ArrayList<>();
//		userDetails.add(User.withDefaultPasswordEncoder().username("kirti").password("kirti123").roles("USER").build());
//		return new InMemoryUserDetailsManager(userDetails);
//	}
	
	
}
