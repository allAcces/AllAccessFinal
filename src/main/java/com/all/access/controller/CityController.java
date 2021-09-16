package com.all.access.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.all.access.model.City;
import com.all.access.repository.CityRepository;

@Controller
public class CityController 
{
	@RequestMapping("addcity")
	public String showCity() 
	{
		return "addcity";
	}
	
	@Autowired
	CityRepository cityRepository;
	
	@PostMapping("insertcity")
	public ModelAndView saveUser(@ModelAttribute City city)
	{
		if(cityRepository.save(city)!=null)
		{
			return new ModelAndView("addcity","suceessMsg","City Added Successfully");
		}
		return null;
	}
	
	@GetMapping("viewallCities")
	public ModelAndView displayAllCities()
	{
		ModelAndView cityView=null;
		List<City> cityList = cityRepository.findAll();
		if(!cityList.isEmpty())
			{
			cityView = new ModelAndView("viewallCities","citiesListKey",cityList);
			}
		return cityView;
	}
}
