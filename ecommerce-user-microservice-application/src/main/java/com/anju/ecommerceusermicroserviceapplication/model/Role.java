package com.anju.ecommerceusermicroserviceapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "role_id")
	private int id;

	@Column(name = "role")
	private String role;
	
	@Column(name = "role_details")
	private String roleDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
