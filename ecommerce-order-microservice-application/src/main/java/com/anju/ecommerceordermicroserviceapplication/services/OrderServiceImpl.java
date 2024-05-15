package com.anju.ecommerceordermicroserviceapplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anju.ecommerceordermicroserviceapplication.repository.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService {
	
	
	
	 private OrderRepository orderRepository;

	    @Autowired
	    public void setOrderRepository(OrderRepository orderRepository) {
	        this.orderRepository = orderRepository;
	    }

}
