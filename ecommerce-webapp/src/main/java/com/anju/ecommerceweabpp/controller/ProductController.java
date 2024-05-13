package com.anju.ecommerceweabpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.anju.ecommerceweabpp.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/")
	public String productListing(Model model) {

		String productUrl = "http://localhost:8081/product/listing"; // URL of the ProductController endpoint
        Product[] products = restTemplate.getForObject(productUrl, Product[].class);
        model.addAttribute("products", products);
        return "product/product-listing"; // Thymeleaf template name without ".html" extension
	}
	@GetMapping("/product/details/{id}")
    public String getProductDetails(Model model, @PathVariable Long id) {
        String productDetailsUrl = "http://localhost:8081/product/details/" + id;
        Product product = restTemplate.getForObject(productDetailsUrl, Product.class);
        model.addAttribute("product", product);
        return "product/product-details"; // Thymeleaf template for product details page
    }

}
