package com.anju.ecommerceweabpp.model;

public class Product {
	
	private Long productId;
    private Long userId;
    private Long categoryId;
    private Long subCategoryId;
    private String productName;
    private String productDetails;
    private String productFeatures;
    private Double productUnitPrice;
    private Integer productTotalQuantity;
    private Integer productAvaialbeQuantity;
    private Integer productStatus;
    private String productCreationDate;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(Long subCategoryId) {
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
	public Double getProductUnitPrice() {
		return productUnitPrice;
	}
	public void setProductUnitPrice(Double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}
	public Integer getProductTotalQuantity() {
		return productTotalQuantity;
	}
	public void setProductTotalQuantity(Integer productTotalQuantity) {
		this.productTotalQuantity = productTotalQuantity;
	}
	public Integer getProductAvaialbeQuantity() {
		return productAvaialbeQuantity;
	}
	public void setProductAvaialbeQuantity(Integer productAvaialbeQuantity) {
		this.productAvaialbeQuantity = productAvaialbeQuantity;
	}
	public Integer getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}
	public String getProductCreationDate() {
		return productCreationDate;
	}
	public void setProductCreationDate(String productCreationDate) {
		this.productCreationDate = productCreationDate;
	}

}
