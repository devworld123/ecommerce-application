package com.anju.ecommerceproductmicroserviceapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_sub_category")
public class SubCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sub_category_id")
	private long subCategoryId;
	@Column(name = "category_id")
	private long categoryId;
	@Column(name = "sub_category_name")
	private String subCategoryName;
	@Column(name = "sub_category_details")
	private String subCategoryDetails;
	@Column(name = "sub_category_status")
	private int subCategoryStatus;
	@Column(name = "user_id")
	private long userId;
	@Column(name = "sub_category_creation_status")
	private String subCategoryCreationStatus;

	public long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getSubCategoryDetails() {
		return subCategoryDetails;
	}

	public void setSubCategoryDetails(String subCategoryDetails) {
		this.subCategoryDetails = subCategoryDetails;
	}

	public int getSubCategoryStatus() {
		return subCategoryStatus;
	}

	public void setSubCategoryStatus(int subCategoryStatus) {
		this.subCategoryStatus = subCategoryStatus;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getSubCategoryCreationStatus() {
		return subCategoryCreationStatus;
	}

	public void setSubCategoryCreationStatus(String subCategoryCreationStatus) {
		this.subCategoryCreationStatus = subCategoryCreationStatus;
	}
}
