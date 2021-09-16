package com.all.access.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.all.access.model.Enquiry;


	@Component
	public interface EnquiryRepository extends JpaRepository<Enquiry,String>
	{

	}
