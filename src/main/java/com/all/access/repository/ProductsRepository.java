package com.all.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.all.access.model.Products;

@Component
public interface ProductsRepository extends JpaRepository<Products,String> 
{

	Products findByproductId(String productid);
	

}
