package com.app.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.entities.Product;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class TestProductRepo {

	@Autowired
	private ProductRepo prdRepo;

	@Test
	void testAddProduct() {
		Product prd = new Product("Chips", 50, 30, "Snacks");
		Product save = prdRepo.save(prd);
		assertEquals(1, save.getId());
	}

	@Test
	void testGetAllProduct() {
		// Product prd = new Product("Chips", 50, 30, "Snacks");
		List<Product> findAll = prdRepo.findAll();
		assertEquals(1, findAll.size());
	}
	
	

}
