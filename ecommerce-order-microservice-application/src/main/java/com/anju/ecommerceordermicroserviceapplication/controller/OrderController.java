package com.anju.ecommerceordermicroserviceapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anju.ecommerceordermicroserviceapplication.services.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
    private OrderService orderService;
	
	@Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
}
