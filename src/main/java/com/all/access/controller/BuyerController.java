package com.all.access.controller;

import org.springframework.stereotype.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.all.access.service.BuyerService;
import com.all.access.model.Buyer;

@Controller
public class BuyerController 
{
	@RequestMapping("/buyerregistration")
	public String show() 
	{
		return "buyerregistration";
	}
	
	@Autowired
	BuyerService buyerService;
	
	@PostMapping("/usersaveurl")
	public ModelAndView saveUser(@ModelAttribute Buyer user)
	{
		if(buyerService.save(user)!=null)
		{
			return new ModelAndView("buyerlogin");
		}
		return null;
	}
	
	@PostMapping("/userloginurl") 
	public ModelAndView loginUser(@RequestParam("username") String buyerUserName ,@RequestParam("password") String buyerPassword) 
	{
		ModelAndView userview = null;
		Buyer buyer = buyerService.findByUserNameAndPassword(buyerUserName,buyerPassword);
		if(buyer != null)
		{
			String buyerRegisteredUserName = buyer.getUsersEmailAddress();
			String buyerRegisteredPassword = buyer.getUsersPassword();
			if(buyerUserName.equalsIgnoreCase(buyerRegisteredUserName) && buyerPassword.equalsIgnoreCase(buyerRegisteredPassword))
			{
				userview = new ModelAndView();
				userview.setViewName("buyeruser");
			}
		}
		else
		{
			userview = new ModelAndView("buyerlogin");
		}
		return userview;
	}
	
	
	@RequestMapping("/buyerlogin")
	public String showBuyerLoginForm()
	{
		return "buyerlogin";
	}
	
	@GetMapping("/viewallbuyers")
	public ModelAndView displayAllRegisteredBuyers()
	{
		ModelAndView buyerView=null;
		List<Buyer> buyerList = buyerService.findAll();
		if(!buyerList.isEmpty())
			{
				buyerView = new ModelAndView("viewallbuyers","buyerListKey",buyerList);
			}
		return buyerView;
	}
}
