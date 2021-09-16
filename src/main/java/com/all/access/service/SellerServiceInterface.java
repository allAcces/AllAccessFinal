package com.all.access.service;

import java.util.List;

import com.all.access.model.Seller;

public interface SellerServiceInterface 
{
	Seller save(Seller buyer);
	List<Seller> findAll();

}
