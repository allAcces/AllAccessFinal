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
import com.all.access.model.Products;
import com.all.access.repository.ProductsRepository;

@RestController
@RequestMapping("products")
public class ProductsRestController 
{
	@Autowired
	ProductsRepository productsRepository; 
	@GetMapping("displayAllProdcuts")
	public List<Products> displayAllProducts()
	{
		return productsRepository.findAll();
	}
	@PostMapping("insertNewProduct")
	public String saveProduct(@RequestBody Products product)
	{
		productsRepository.save(product);
		return "New Product Inserted";
	}
	@GetMapping("fetchOne/{productId}")
	public Optional<Products> displayProductById(@PathVariable String productId)
	{
		return productsRepository.findById(productId);
	}
	@PutMapping("/update/{price}")
	Products update(@PathVariable float price,@RequestBody Products product)
	{
		product.setPrice(price);
		return product;
	}
	@DeleteMapping("/delete/{productId}")
	String deleteEmployee(@PathVariable String productId)
	{
		System.out.println(productId);
		return "Product With id"+productId+"Deleted";
	}
}
