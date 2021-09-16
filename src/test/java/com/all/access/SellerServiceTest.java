package com.all.access;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.all.access.service.SellerService;
import com.all.access.model.Seller;

@SpringBootTest
class SellerServiceTest 
{
	@Autowired
	SellerService sellerService;

	@Test
	void testSave() 
	{
		Seller seller = new Seller();
		seller.setShopowner_name("Anuj Goyal");
		seller.setShopowner_email("anuj.goyal@gmail.com");
		seller.setPassword("Anuj");
		seller.setShop_address_pincode(110096);
		seller.setShop_address_contact_number("9971302487");
		seller.setShop_address_email("antique.furniture@gmail.com");
		seller.setShop_name("Antique Furniture");
		seller.setShop_timings("12:00-18:00");
		seller.setShop_website("www.antique.furniture.com");
		sellerService.save(seller);
		assertThat(seller.getShopid()).isGreaterThan(0);
	}

	@Test
	void testFindAll() {
		List<Seller> sellerList = (List<Seller>) sellerService.findAll();
		assertThat(sellerList).size().isGreaterThan(0);
	}


}