package com.all.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.data.jpa.repository.Query;
import com.all.access.model.Seller;

@Controller
public interface SellerRepository extends JpaRepository<Seller,Integer> 
{
	@Query("from Seller where shopowner_email = ?1 and password = ?2")
	Seller findByUserNameAndPassword(String shopowner_email,String password);
}
