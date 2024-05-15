package com.anju.ecommerceordermicroserviceapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order")
public class Order {

	@Column(name="order_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long orderId;
	
	@Column(name="order_user_id")
	private Long userId;
	
	@Column(name="order_status")
	@Enumerated(EnumType.STRING) // Specify how the enum should be stored in the database
	private OrderStatus orderStatus;
	
	@Column(name="order_placed_date")
	private String orderPlacedDate;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderPlacedDate() {
		return orderPlacedDate;
	}

	public void setOrderPlacedDate(String orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}
}
