package com.anju.ecommerceproductmicroserviceapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anju.ecommerceproductmicroserviceapplication.model.Product;
import com.anju.ecommerceproductmicroserviceapplication.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
    private ProductRepository productRepository;
	
	@GetMapping("/product/listing")
    public List<Product> getAllProducts() {
       
		return productRepository.findAll();
    }
	
	@GetMapping("/product/details/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));
    }
}
