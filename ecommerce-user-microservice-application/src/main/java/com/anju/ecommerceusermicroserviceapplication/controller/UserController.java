package com.anju.ecommerceusermicroserviceapplication.controller;

import java.util.Collections;
import java.util.HashMap;
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
    public ResponseEntity<Map<String, Object>> loginUser(@RequestBody Map<String, String> loginRequest) {
        String email = loginRequest.get("emailId");
        String password = loginRequest.get("password");

        if (email == null || password == null) {
            return ResponseEntity.badRequest().body(Collections.singletonMap("error", "Email and password are required."));
        }

        User loginUser = new User();
        loginUser.setEmailId(email);
        loginUser.setPassword(password);

        User loggedInUser = userService.loginUser(loginUser);
        if (loggedInUser == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                                 .body(Collections.singletonMap("error", "User not found or incorrect credentials."));
        }

        // Construct user details to return
        Map<String, Object> userDetails = new HashMap<>();
        userDetails.put("userId", loggedInUser.getUserId());
        userDetails.put("name", loggedInUser.getFirstName() + " " + loggedInUser.getLastName());
        userDetails.put("email", loggedInUser.getEmailId());
        userDetails.put("roleId", loggedInUser.getUserRoleId());

        return ResponseEntity.ok(userDetails);
    }

    
    
    
}
