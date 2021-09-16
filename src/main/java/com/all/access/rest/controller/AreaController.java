package com.all.access.rest.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.all.access.model.Area;
import com.all.access.repository.AreaRepository;


@RestController
@RequestMapping("area")
public class AreaController 
{
	@Autowired
	AreaRepository areaRepository; 
	@GetMapping("displayAllArea")
	public List<Area> displayAllArea()
	{
		return areaRepository.findAll();
	}
	@PostMapping("insertNewArea")
	public String saveArea(@RequestBody Area area)
	{
		areaRepository.save(area);
		return "New Area Inserted";
	}
	@GetMapping("fetchOne/{areaId}")
	public Optional<Area> displayAreaById(@PathVariable String areaId)
	{
		return areaRepository.findById(areaId);
	}
	@PutMapping("/update/{areaName}")
	Area update(@PathVariable String areaName,@RequestBody Area area)
	{
		area.setAreaName(areaName);
		return area;
	}
	@DeleteMapping("/delete/{areaId}")
	String deleteArea(@PathVariable String areaId)
	{
		System.out.println(areaId);
		return "Area With id "+areaId+" Deleted";
	}
}
