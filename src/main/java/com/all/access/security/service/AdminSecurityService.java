package com.all.access.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.all.access.security.model.AdminPrincipal;
import com.all.access.model.Admin;
import com.all.access.repository.AdminRepository;

@Service
public class AdminSecurityService implements UserDetailsService 
{
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		Admin admin = adminRepository.findByEmailAddress(username);
		
		if(admin == null)
		{
			throw new UsernameNotFoundException("Admin 404");
		}
		return new AdminPrincipal(admin);
	}

}
