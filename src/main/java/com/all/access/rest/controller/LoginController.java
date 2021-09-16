package com.all.access.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController 
{
	@RequestMapping("Home")
	public String show() {
		
		
		return "LoginDemo";
	}
	
	
	 @RequestMapping("loginurl") ModelAndView login(@RequestParam("userName")
	 String userName , @RequestParam("password") String password) {
	 
	 ModelAndView view=null; if(userName.equals("kirti") && password.equals("kirti")) { view=
	 new ModelAndView(); view.setViewName("WelcomeDemo");
	 view.addObject("userkey",userName); }
	 
	 else { 
	 view= new ModelAndView("LoginDemo","errorkey","password is wrong");
	 //view.setViewName("Login");
	 //view.addObject("errorkey","password is wrong");
	 
	 } return view; }
	 

}
