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

import com.all.access.model.Admin;
import com.all.access.repository.AdminRepository;


@RestController
@RequestMapping("Admin")
public class AdminRestController {
	@Autowired
	AdminRepository adminRepository; 
	
	@PostMapping("insertNewadmin")
	public String saveUsers(@RequestBody Admin admin)
	{
		adminRepository.save(admin);
		return "New Admin Inserted";
	}
	

}
