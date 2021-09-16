package com.all.access.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.all.access.model.Category;
import com.all.access.repository.CategoryRepository;

@Controller
public class CategoryController 
{
	@RequestMapping("addcategory")
	public String showCategory() 
	{
		return "addcategory";
	}
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@PostMapping("insertcategory")
	public ModelAndView saveUser(@ModelAttribute Category category)
	{
		if(categoryRepository.save(category)!=null)
		{
			return new ModelAndView("addcategory","suceessMsg","Category Added Successfully");
		}
		return null;
	}
	
	@GetMapping("viewallCategories")
	public ModelAndView displayAllCategories()
	{
		ModelAndView categoriesView=null;
		List<Category> categoryList = categoryRepository.findAll();
		if(!categoryList.isEmpty())
			{
				categoriesView = new ModelAndView("viewallCategories","categoryListKey",categoryList);
			}
		return categoriesView;
	}
}
