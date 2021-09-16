package com.all.access.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.all.access.model.SubCategory;
import com.all.access.repository.SubCategoryRepository;

@Controller
public class SubCategoryController 
{
	@RequestMapping("addsubcategory")
	public String showSubCategory() 
	{
		return "addsubcategory";
	}
	
	@Autowired
	SubCategoryRepository subCategoryRepository;
	
	@PostMapping("insertsubcategory")
	public ModelAndView saveSubCategory(@ModelAttribute SubCategory subCategory)
	{
		if(subCategoryRepository.save(subCategory)!=null)
		{
			return new ModelAndView("addsubcategory","suceessMsg","SubCategory Added Successfully");
		}
		return null;
	}
	
	@GetMapping("viewallSubCategories")
	public ModelAndView displayAllSubCategories()
	{
		ModelAndView subCategoryView=null;
		List<SubCategory> subCategoryList = subCategoryRepository.findAll();
		if(!subCategoryList.isEmpty())
			{
			subCategoryView = new ModelAndView("viewallSubCategories","subCategoryListKey",subCategoryList);
			}
		return subCategoryView;
	}

}
