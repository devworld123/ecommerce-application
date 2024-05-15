package com.anju.ecommerceusermicroserviceapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anju.ecommerceusermicroserviceapplication.model.User;


@Service
public interface UserService {
	
	User getUserById(Long id);

    List<User> getAllUsers();

    User createUser(User user);

    User updateUser(Long id, User user);

    User loginUser(User user);
    
    User findByEmail(User user);
	
}
