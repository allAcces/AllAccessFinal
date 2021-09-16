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

import com.all.access.model.Buyer;
import com.all.access.repository.BuyerRepository;


@RestController
@RequestMapping("users")
public class BuyerRestController {
	@Autowired
	BuyerRepository usersRepository; 
	@GetMapping("displayAllUsers")
	public List<Buyer> displayAllUsers()
	{
		return usersRepository.findAll();
	}
	@PostMapping("insertNewUsers")
	public String saveUsers(@RequestBody Buyer users)
	{
		usersRepository.save(users);
		return "New User Inserted";
	}
	@GetMapping("fetchOne/{areaId}")
	public Optional<Buyer> displayUsersById(@PathVariable String userId)
	{
		return usersRepository.findById(userId);
	}
	@PutMapping("/update/{usersName}")
	Buyer update(@PathVariable String usersName,@RequestBody Buyer users)
	{
		users.setUsersName(usersName);
		return users;
	}
	@DeleteMapping("/delete/{usersId}")
	String deleteUsers(@PathVariable String usersId)
	{
		System.out.println(usersId);
		return "user With id "+usersId+" Deleted";
	}
}
