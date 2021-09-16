package com.all.access.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.all.access.model.Seller;
import com.all.access.repository.SellerRepository;

@Service
public class SellerService implements SellerServiceInterface 
{
	@Autowired
	SellerRepository sellerRepository;
	
	@Override
	public Seller save(Seller seller) {
		// TODO Auto-generated method stub
		return sellerRepository.save(seller);
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return sellerRepository.findAll();
	}
}
