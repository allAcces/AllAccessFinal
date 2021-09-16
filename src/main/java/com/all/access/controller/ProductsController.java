package com.all.access.controller;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.all.access.repository.ProductsRepository;
import com.all.access.model.Products;
@Controller
public class ProductsController {
	@RequestMapping("products")
	public String show() 
	{
		return "products";
	}
	
	@Autowired
	ProductsRepository productsRepository;
	
	@PostMapping("productsaveurl")
	public ModelAndView saveProducts(@ModelAttribute Products products)
	{
		if(productsRepository.save(products)!=null)
		{
			return new ModelAndView("products","ProductInsertSuccessMsg","New Product Added Successfully");
		}
		return null;
	}
	
/*	@PostMapping("productssearchurl") 
	public ModelAndView searchProducts(@RequestParam("id") String productid) 
	{
		ModelAndView productview = null;
	Products products = (productsRepository).findByproductId(productid);
		if(products != null)
		{
			String productsRegisteredId = products.getProductTitle();
			
			if(productid.equalsIgnoreCase(productsRegisteredId))
			{
				productview = new ModelAndView();
				productview.setViewName("buyeruser");
			}
		}
		else
		{
			productview = new ModelAndView("productssearch");
		}
		return productview;
	}
	
	
	@RequestMapping("productssearch")
	public String showProductsSearchForm()
	{
		return "productssearch";
	}*/
	
	@GetMapping("viewallproducts")
	public ModelAndView displayAllRegisteredProducts()
	{
		ModelAndView productView=null;
		List<Products> productsList = productsRepository.findAll();
		if(!productsList.isEmpty())
			{
				productView = new ModelAndView("viewallproducts","productsListKey",productsList);
			}
		return productView;
	}

}
