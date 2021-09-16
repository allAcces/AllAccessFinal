package com.all.access.rest.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.all.access.model.Enquiry;
import com.all.access.repository.EnquiryRepository;



@RestController
@RequestMapping("enquiry")
public class EnquiryRestController {

	
	@Autowired
	EnquiryRepository enquiryRepository; 
	@GetMapping("displayAllEnquiry")
	public List<Enquiry> displayAllEnquiry()
	{
		return enquiryRepository.findAll();
	}
	
	
	@PostMapping("insertNewEnquiry")
	public String saveEnquiry(@RequestBody Enquiry enquiry)
	{
		enquiryRepository.save(enquiry);
		return "New Enquiry Inserted";
	}
	
	@GetMapping("fetchOne/{enquiryId}")
	public Optional<Enquiry> displayEnquiryById(@PathVariable String enquiryId)
	{
		return enquiryRepository.findById(enquiryId);
	}
	
	
	@PutMapping("/update/{enquiryMsg}")
	Enquiry update(@PathVariable String enquiryMsg,@RequestBody Enquiry enquiry )
	{
		enquiry.setEnquiryMsg(enquiryMsg);
		return enquiry;
	}
	
	@DeleteMapping("/delete/{categoryId}")
	String deleteEnquiry(@PathVariable String enquiryId)
	{
		System.out.println(enquiryId);
		return "Enquiry With id "+enquiryId+" Deleted";
	}
}
