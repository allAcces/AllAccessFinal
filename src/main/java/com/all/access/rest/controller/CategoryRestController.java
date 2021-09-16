package com.all.access.rest.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.all.access.model.Category;
import com.all.access.repository.CategoryRepository;

@RestController
@RequestMapping("category")
public class CategoryRestController 
{

	
	@Autowired
	CategoryRepository categoryRepository; 
	@GetMapping("displayAllCategory")
	public List<Category> displayAllCategory()
	{
		return categoryRepository.findAll();
	}
	
	
	@PostMapping("insertNewCategory")
	public String saveCategory(@RequestBody Category category)
	{
		categoryRepository.save(category);
		return "New Category Inserted";
	}
	
	@GetMapping("fetchOne/{categoryId}")
	public Optional<Category> displayCategoryById(@PathVariable String categoryId)
	{
		return categoryRepository.findById(categoryId);
	}
	
	
	@PutMapping("/update/{categoryName}")
	Category updateCategory(@PathVariable String categoryName,@RequestBody Category category )
	{
		category.setCategoryName(categoryName);
		return category;
	}
	
	@DeleteMapping("/delete/{categoryId}")
	String deleteCategory(@PathVariable String categoryId)
	{
		System.out.println(categoryId);
		return "Category With id "+categoryId+" Deleted";
	}
}