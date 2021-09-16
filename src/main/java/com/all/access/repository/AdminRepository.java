package com.all.access.repository;

import org.springframework.stereotype.Component;

import com.all.access.model.Admin;
import com.all.access.model.Buyer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Component
public interface AdminRepository extends JpaRepository<Admin,String> 
{
	@Query("from Admin where emailAddress = ?1 and password = ?2")
	Admin findByUserNameAndPassword(String username,String password);
	
	Admin findByEmailAddress(String username);
}