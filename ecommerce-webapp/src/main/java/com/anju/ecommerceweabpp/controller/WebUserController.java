package com.anju.ecommerceweabpp.controller;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.anju.ecommerceweabpp.model.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class WebUserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		  User user = new User();
		
		model.addObject("user", user);
		model.setViewName("user/login");
		return model;
	}
	
	@GetMapping("/user/signup")
	public String signUp(Model model) {
	    
	    User user = new User();
	    model.addAttribute("user", user);
	    return "user/sign-up-user"; 
	}
	@GetMapping("/user/signupvendor")
	public String signUpVendor(Model model) {
	    
	    User user = new User();
	    model.addAttribute("user", user);
	    return "user/sign-up-vendor"; 
	}
	
	
	
	@PostMapping("/user/signup")
    public String signUpSubmit(@ModelAttribute User user) {
		// Set today's date as the user creation date
	    LocalDate today = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String formattedDate = today.format(formatter);
	    user.setUserCreationDate(formattedDate);
	    user.setUserStatus(1); //  1 represents active status
	    
	    		
        String userUrl = "http://localhost:8082/api/user/createUser"; // URL of the UserController API endpoint for user creation
        ResponseEntity<User> response = restTemplate.postForEntity(userUrl, user, User.class);
        if (response.getStatusCode() == HttpStatus.CREATED) {
            return "redirect:/login"; // Redirect to login page after successful user creation
        } else {
            // Handle error or display a message
            return "error"; // Thymeleaf template for error handling
        }
    }
	
	@PostMapping("/login")
	public String loginUser(@ModelAttribute User loginUser, Model model, HttpSession session) {
	    String email = loginUser.getEmailId();
	    String password = loginUser.getPassword();
	    
	    if (email == null || password == null) {
	        model.addAttribute("error", "Email and password are required.");
	        return "user/login"; // Redirect back to login page with error message
	    }
	    
	    // Create a Map for the login request data
	    Map<String, String> loginRequest = new HashMap<>();
	    loginRequest.put("emailId", email);
	    loginRequest.put("password", password);
	    
	    String userUrl = "http://localhost:8082/api/user/login"; // URL of the UserController API endpoint for user login
	    
	    try {
	        // Send the login request using RestTemplate
	        ResponseEntity<String> response = restTemplate.postForEntity(userUrl, loginRequest, String.class);
	        
	        if (response.getStatusCode() == HttpStatus.OK) {
	            // Successful login, redirect to dashboard
	            session.setAttribute("userId", email); // Set userId in session (example, you can set actual user ID here)
	            return "redirect:/product/listing"; // Redirect to dashboard upon successful login
	        } else {
	            model.addAttribute("error", "Invalid email or password.");
	            return "/login"; // Redirect back to login page with error message
	        }
	    } catch (HttpClientErrorException ex) {
	        model.addAttribute("error", "Error logging in. Please try again later.");
	        return "user/login"; // Redirect back to login page with error message
	    }
	}
    
}
