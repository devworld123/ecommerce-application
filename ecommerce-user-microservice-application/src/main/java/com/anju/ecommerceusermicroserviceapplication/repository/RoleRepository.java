package com.anju.ecommerceusermicroserviceapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anju.ecommerceusermicroserviceapplication.model.Role;


@Repository("roleRepository")
public interface RoleRepository  extends JpaRepository<Role, Integer>{
	Role findByRole(String role);
}
