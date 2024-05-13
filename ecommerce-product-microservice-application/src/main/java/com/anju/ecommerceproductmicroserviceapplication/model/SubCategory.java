package com.anju.ecommerceproductmicroserviceapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_sub_category")
public class SubCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long subCategoryId;
	private long categoryId;
	private String subCategoryName;
	private String subCategoryDetails;
	private int subCategoryStatus;
	private long userId;
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
