package com.anju.ecommerceproductmicroserviceapplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anju.ecommerceproductmicroserviceapplication.model.Product;
import com.anju.ecommerceproductmicroserviceapplication.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	
	@Override
	public Optional<Product> getById(Long id) {
		return productRepository.findById(id);
	}
}
