package com.all.access.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.all.access.service.AdminService;
import com.all.access.model.Admin;

@Controller
public class AdminController 
{
	@RequestMapping("/admin")
	public String openAdminPage()
	{
		return "admin";
	}
	
	
	@Autowired
	AdminService adminService;
	
	
	@PostMapping("adminsaveurl")
	public ModelAndView saveAdmin(@ModelAttribute Admin admin)
	{
		if(adminService.save(admin)!=null)
		{
			return new ModelAndView("adminlogin");
		}
		return null;
	}
	
	@PostMapping("/adminloginurl") 
	public ModelAndView loginAdmin(@RequestParam("username") String adminUserName , @RequestParam("password") String adminPassword) 
	{
		ModelAndView adminview = null;
		Admin admin = adminService.findByUserNameAndPassword(adminUserName, adminPassword);
		if(admin!=null)
		{
			String adminemail = admin.getEmailAddress();
			String adminpassword = admin.getPassword();
			if(adminUserName.equalsIgnoreCase(adminemail) && adminPassword.equalsIgnoreCase(adminpassword))
			{
				adminview = new ModelAndView();
				adminview.setViewName("admin");
			}
		}
		else
		{
			adminview = new ModelAndView("adminlogin","errorkey","password is wrong");
		}
		return adminview; 
	}
	
	@RequestMapping("/adminlogin")
	public String showAdminLoginForm() 
	{
		return "adminlogin";
	}
	
	@RequestMapping("/index")
	public String logout() 
	{
		return "index";
	}
}