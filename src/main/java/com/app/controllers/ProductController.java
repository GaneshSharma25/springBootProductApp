package com.app.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	public ProductController() {
		System.out.println("in ctor of " + getClass());
	}

	@Autowired
	private ProductService prdService;

	@GetMapping
	public List<Product> getAllProduct() {
		return prdService.getAllProduct();
	}

	@PostMapping
	public Product addProduct(@RequestBody Product prd) {
		return prdService.addProduct(prd);
	}

	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") Long id) {
		return prdService.getProdById(id);

	}

}
