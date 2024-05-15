package com.anju.ecommerceusermicroserviceapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anju.ecommerceusermicroserviceapplication.model.User;
import com.anju.ecommerceusermicroserviceapplication.repository.RoleRepository;
import com.anju.ecommerceusermicroserviceapplication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(Long id, User user) {
		if (userRepository.existsById(id)) {
			user.setUserId(id);
			return userRepository.save(user);
		} else {
			return null;
		}
	}
	@Override
	public User loginUser(User loginUser) {
	    if (loginUser == null || loginUser.getEmailId() == null || loginUser.getPassword() == null) {
	        return null; // Invalid login request
	    }

	    // Check if the email and password match a user in the database
	    return userRepository.findByEmailIdAndPassword(loginUser.getEmailId(), loginUser.getPassword());
	}


	@Override
	public User findByEmail(User user) {
		return userRepository.findByEmailId(user.getEmailId());
	}

}
