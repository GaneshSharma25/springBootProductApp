package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Product;
import com.app.exception.ProductException;
import com.app.repository.ProductRepo;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	public ProductServiceImpl() {
		System.out.println("in ctor of "+getClass());
	}
	@Autowired
	private ProductRepo prdRepo;
	
	@Override
	public List<Product> getAllProduct() {
		return prdRepo.findAll();
	}

	@Override
	public Product addProduct(Product prd) {
		return prdRepo.save(prd);
	}

	@Override
	public Product getProdById(Long id) {
		return prdRepo.findById(id).orElseThrow(() -> new ProductException("product not found for given id.."));
	}

}
