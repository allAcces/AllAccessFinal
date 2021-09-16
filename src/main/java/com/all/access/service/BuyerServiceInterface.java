package com.all.access.service;

import com.all.access.model.Buyer;
import java.util.List;

public interface BuyerServiceInterface 
{
	Buyer save(Buyer buyer);
	Buyer findByUserNameAndPassword(String username,String password);
	List<Buyer> findAll();
}
