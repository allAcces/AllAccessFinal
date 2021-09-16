package com.all.access.service;

import com.all.access.model.Admin;


public interface AdminServiceInterface 
{
	Admin save(Admin admin);
	Admin findByUserNameAndPassword(String username,String password);
}