package com.anju.ecommerceproductmicroserviceapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anju.ecommerceproductmicroserviceapplication.model.Product;
import com.anju.ecommerceproductmicroserviceapplication.services.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
    private ProductService productService;
	
	@GetMapping("/listing")
    public List<Product> getAllProducts() {
       
		return productService.getAll();
    }
	
	@GetMapping("/details/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));
    }
}
