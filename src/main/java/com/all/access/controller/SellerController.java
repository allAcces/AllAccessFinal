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
import com.all.access.repository.SellerRepository;
import com.all.access.model.Seller;

@Controller
public class SellerController 
{
	@RequestMapping("sellerregistration")
	public String showSellerRegisteration()
	{
		return "sellerregistration";
	}
	
	@Autowired
	SellerRepository sellerRepository;
	
	@PostMapping("sellersaveurl")
	public ModelAndView saveSeller(@ModelAttribute Seller seller)
	{
		if(sellerRepository.save(seller) != null)
		{
			return new ModelAndView("sellerlogin");
		}
		return null;
	}
	
	@PostMapping("sellerloginurl")
	public ModelAndView loginSeller(@RequestParam("shopowner_email") String sellerUserName , @RequestParam("password") String sellerPassword)
	{
		ModelAndView sellerView = null;
		Seller seller = sellerRepository.findByUserNameAndPassword(sellerUserName, sellerPassword);
		if(seller != null)
		{
			String sellerRegisteredUsername = seller.getShopowner_email();
			String sellerRegisteredPassword = seller.getPassword();
			
			if(sellerUserName.equalsIgnoreCase(sellerRegisteredUsername) && sellerPassword.equalsIgnoreCase(sellerRegisteredPassword))
			{
				sellerView = new ModelAndView();
				sellerView.setViewName("selleruser");
			}
		}
		else
		{
			sellerView = new ModelAndView("sellerlogin"); 
		}
		
		return sellerView;
	}
	
	@RequestMapping("sellerlogin")
	public String showSellerLoginForm()
	{
		return "sellerlogin";
	}
	
	@GetMapping("viewallsellers")
	public ModelAndView displayAllRegisteredSellers()
	{
		ModelAndView sellerView = null;
		List<Seller> sellerList = sellerRepository.findAll();
		if(!sellerList.isEmpty())
		{
			sellerView = new ModelAndView("viewallsellers","sellerListKey",sellerList);
		}
		return sellerView;
	}
	

}
