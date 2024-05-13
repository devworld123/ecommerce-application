package com.anju.ecommerceproductmicroserviceapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anju.ecommerceproductmicroserviceapplication.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
