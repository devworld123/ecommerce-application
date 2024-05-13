package com.anju.ecommerceusermicroserviceapplication.service;

import org.springframework.stereotype.Service;

import com.anju.ecommerceusermicroserviceapplication.model.User;


@Service
public interface UserService {
	public User findUserByEmail(String email);

	public void saveUser(User user);
}
