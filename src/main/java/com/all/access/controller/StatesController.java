package com.all.access.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.all.access.model.States;
import com.all.access.repository.StatesRepository;

@Controller
public class StatesController 
{
	@RequestMapping("addstate")
	public String showState() 
	{
		return "addstate";
	}
	
	@Autowired
	StatesRepository statesRepository;
	
	@PostMapping("insertstate")
	public ModelAndView saveUser(@ModelAttribute States states)
	{
		if(statesRepository.save(states)!=null)
		{
			return new ModelAndView("addstate","suceessMsg","State Added Successfully");
		}
		return null;
	}
	
	@GetMapping("viewallStates")
	public ModelAndView displayAllStates()
	{
		ModelAndView statesView=null;
		List<States> statesList = statesRepository.findAll();
		if(!statesList.isEmpty())
			{
			statesView = new ModelAndView("viewallStates","statesListKey",statesList);
			}
		return statesView;
	}
}
