package com.anju.ecommerceweabpp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.anju.ecommerceweabpp.model.User;

@Controller
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	/*
	@RequestMapping(value = { "/user/signup" }, method = RequestMethod.GET)
	public String signUp(Model model) {

		String userUrl = "http://localhost:8082/user/signup"; // URL of the user endpoint
        User[] user = restTemplate.getForObject(userUrl, User[].class);
        model.addAttribute("user", user);
        return "user/sign-up"; // Thymeleaf template name without ".html" extension
	}
	*/
	@GetMapping("/user/signup")
	public String signUp(Model model) {
	    
	    User user = new User();
	    model.addAttribute("user", user);
	    return "user/sign-up"; // Thymeleaf template name without ".html" extension
	}
    
}
