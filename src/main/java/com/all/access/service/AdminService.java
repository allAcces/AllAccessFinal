package com.all.access.service;

import com.all.access.model.Admin;
import com.all.access.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements AdminServiceInterface
{
	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public Admin save(Admin admin)
	{
		return adminRepository.save(admin);
	}
	
	@Override
	public Admin findByUserNameAndPassword(String username,String password)
	{
		return adminRepository.findByUserNameAndPassword(username, password);
	}

}
