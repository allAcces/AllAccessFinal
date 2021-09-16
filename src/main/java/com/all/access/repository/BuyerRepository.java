package com.all.access.repository;

import org.springframework.stereotype.Component;
import com.all.access.model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Component
public interface BuyerRepository extends JpaRepository<Buyer,String> 
{
	@Query("from Buyer where usersEmailAddress = ?1 and usersPassword = ?2")
	Buyer findByUserNameAndPassword(String username,String password);
}