package com.anju.ecommerceproductmicroserviceapplication.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anju.ecommerceproductmicroserviceapplication.model.Product;
import java.util.Optional;

@Service
public interface ProductService {

	List<Product> getAll();
	
	Optional<Product> getById(Long id);
}
