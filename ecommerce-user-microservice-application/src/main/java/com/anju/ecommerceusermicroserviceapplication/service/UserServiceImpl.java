package com.anju.ecommerceusermicroserviceapplication.service;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.anju.ecommerceusermicroserviceapplication.model.Role;
import com.anju.ecommerceusermicroserviceapplication.model.User;
import com.anju.ecommerceusermicroserviceapplication.repository.RoleRepository;
import com.anju.ecommerceusermicroserviceapplication.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;  
	// BCryptPasswordEncoder is a custom bean used for encrypting password, Provided by the spring security feature.
	//create the configuration classes for the security feature and
	//implement the WebSecurityConfigurerAdapter(Abstract class) and WebMvcConfigurer interface

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setActive(1);
		Role userRole = roleRepository.findByRole("ADMIN");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}
}
