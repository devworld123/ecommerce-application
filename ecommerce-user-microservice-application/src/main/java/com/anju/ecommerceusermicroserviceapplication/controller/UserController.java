package com.anju.ecommerceusermicroserviceapplication.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anju.ecommerceusermicroserviceapplication.model.User;
import com.anju.ecommerceusermicroserviceapplication.service.UserService;


@RestController
@RequestMapping("/api/user")
public class UserController {

	
	@Autowired
    private UserService userService;
	
	
	
	@GetMapping("/listing")
    public List<User> getAllUsers() {
       
		return userService.getAllUsers();
    }
	

    @GetMapping("/details/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user) {
    	
    	   	
        User createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @PutMapping("/details/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody Map<String, String> loginRequest) {
        String email = loginRequest.get("emailId");
        String password = loginRequest.get("password");

        if (email == null || password == null) {
            return ResponseEntity.badRequest().body("Email and password are required.");
        }

        User loginUser = new User();
        loginUser.setEmailId(email);
        loginUser.setPassword(password);

        if (!userService.loginUser(loginUser)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not found or incorrect credentials.");
        }

        return ResponseEntity.ok("Login successful.");
    }
    
    
    
}
