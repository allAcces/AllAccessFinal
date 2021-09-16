package com.all.access;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.all.access.service.BuyerService;
import com.all.access.model.Buyer;

@SpringBootTest
class BuyerServiceTest 
{
	@Autowired
	BuyerService buyerService;

	@Test
	void testSave() {
		Buyer buyer = new Buyer();
		buyer.setUserFullName("Mani Shekhar");
		buyer.setUsersName("Mani");
		buyer.setUsersEmailAddress("manicool@gmail.com");
		buyer.setUserContactNumber("9718363417");
		buyer.setUserGender("Male");
		buyerService.save(buyer);
		assertThat(buyer.getUsersId()).isGreaterThan(0);
	}

	@Test
	void testFindAll() {
		List<Buyer> buyerList = (List<Buyer>) buyerService.findAll();
		assertThat(buyerList).size().isGreaterThan(0);
	}

}
 