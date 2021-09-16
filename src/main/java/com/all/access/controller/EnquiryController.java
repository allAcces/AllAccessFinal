package com.all.access.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.all.access.model.Enquiry;
import com.all.access.repository.EnquiryRepository;

@Controller
public class EnquiryController 
{
	@RequestMapping("enquiryForm")
	public String showEnquiryForm()
	{
		return "enquiryForm";
	}
	
	
	@Autowired
	EnquiryRepository enquiryRepository;
	
	@PostMapping("enquirysaveurl")
	public ModelAndView saveEnquiry(@ModelAttribute Enquiry enquiry)
	{
		if(enquiryRepository.save(enquiry) != null)
		{
			return new ModelAndView("enquiryForm","EnquiryInsertSuccessMsg","New Enquiry Inserted Successfully");
		}
		return null;
	}
	

	
	@GetMapping("viewallenquiry")
	public ModelAndView displayAllEnquiry()
	{
		ModelAndView enquiryView = null;
		List<Enquiry> enquiryList = enquiryRepository.findAll();
		if(!enquiryList.isEmpty())
		{
			enquiryView = new ModelAndView("viewallenquiry","enquiryListKey",enquiryList);
		}
		return enquiryView;
	}
}
