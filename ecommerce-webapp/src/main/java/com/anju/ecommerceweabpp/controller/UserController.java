package com.anju.ecommerceweabpp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anju.ecommerceweabpp.model.User;

@Controller
public class UserController {
	
		
	@RequestMapping(value = { "/user/signup" }, method = RequestMethod.GET)
	public ModelAndView signup() {
		ModelAndView model = new ModelAndView();
		User user = new User();
		model.addObject("user", user);
		model.setViewName("user/sign-up");

		return model;
	}

}
