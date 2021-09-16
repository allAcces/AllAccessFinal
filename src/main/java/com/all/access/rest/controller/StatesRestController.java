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
import com.all.access.model.States;
import com.all.access.repository.StatesRepository;

@RestController
@RequestMapping("states")
public class StatesRestController 
{
	@Autowired
	StatesRepository statesRepository; 
	@GetMapping("displayAllStates")
	public List<States> displayAllStates()
	{
		return statesRepository.findAll();
	}
	@PostMapping("insertNewState")
	public String saveState(@RequestBody States state)
	{
		statesRepository.save(state);
		return "New State Inserted";
	}
	@GetMapping("fetchOne/{stateId}")
	public Optional<States> displayStateById(@PathVariable String stateId)
	{
		return statesRepository.findById(stateId);
	}
	@PutMapping("/update/{stateName}")
	States update(@PathVariable String stateName,@RequestBody States state)
	{
		state.setStateName(stateName);
		return state;
	}
	@DeleteMapping("/delete/{stateId}")
	String deleteState(@PathVariable String stateId)
	{
		System.out.println(stateId);
		return "State With id"+stateId+"Deleted";
	}
}
