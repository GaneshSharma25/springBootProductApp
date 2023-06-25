package com.app.service;

import java.util.List;

import com.app.entities.Product;

public interface ProductService {
	
	public List<Product> getAllProduct();

	public Product addProduct(Product prd);

	public Product getProdById(Long id);

	

}
