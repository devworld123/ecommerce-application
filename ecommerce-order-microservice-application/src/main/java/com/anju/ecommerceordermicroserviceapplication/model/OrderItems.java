package com.anju.ecommerceordermicroserviceapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItems {

	@Column(name="order_items_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long orderItemsId;
	
	@Column(name="order_id")		
	private Long orderId;
	
	@Column(name="product_id")
	private Long productId;
	
	@Column(name="order_quantity")
	private Long orderQuantity;
	
	@Column(name="order_item_status")
	private Long orderItemStatus;
	
	@Column(name="order_item_total_cost")
	private Long orderItemTotalCost;

	public Long getOrderItemsId() {
		return orderItemsId;
	}

	public void setOrderItemsId(Long orderItemsId) {
		this.orderItemsId = orderItemsId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Long getOrderItemStatus() {
		return orderItemStatus;
	}

	public void setOrderItemStatus(Long orderItemStatus) {
		this.orderItemStatus = orderItemStatus;
	}

	public Long getOrderItemTotalCost() {
		return orderItemTotalCost;
	}

	public void setOrderItemTotalCost(Long orderItemTotalCost) {
		this.orderItemTotalCost = orderItemTotalCost;
	}
}
