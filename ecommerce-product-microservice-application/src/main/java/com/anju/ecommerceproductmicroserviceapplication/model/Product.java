package com.anju.ecommerceproductmicroserviceapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	long productId;
	
	@Column(name = "user_id")
	long userId;
	@Column(name = "category_id")
	long categoryId;
	@Column(name = "sub_category_id")
	long subCategoryId;
	@Column(name = "product_name")
	String productName;
	@Column(name = "product_details")
	String productDetails;
	@Column(name = "product_features")
	String productFeatures;
	@Column(name = "product_unit_price")
	double productUnitPrice;
	@Column(name = "product_total_quantity")
	int productTotalQuantity;
	@Column(name = "product_available_quantity")
	int productAvaialbeQuantity;
	@Column(name = "product_status")
	int productStatus;
	@Column(name = "product_creation_date")
	String productCreationDate;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public String getProductFeatures() {
		return productFeatures;
	}

	public void setProductFeatures(String productFeatures) {
		this.productFeatures = productFeatures;
	}

	public double getProductUnitPrice() {
		return productUnitPrice;
	}

	public void setProductUnitPrice(double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}

	public int getProductTotalQuantity() {
		return productTotalQuantity;
	}

	public void setProductTotalQuatity(int productTotalQuatity) {
		this.productTotalQuantity = productTotalQuatity;
	}

	public int getProductAvaialbeQuantity() {
		return productAvaialbeQuantity;
	}

	public void setProductAvaialbeQuantity(int productAvaialbeQuantity) {
		this.productAvaialbeQuantity = productAvaialbeQuantity;
	}

	public int getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductCreationDate() {
		return productCreationDate;
	}

	public void setProductCreationDate(String productCreationDate) {
		this.productCreationDate = productCreationDate;
	}

}
