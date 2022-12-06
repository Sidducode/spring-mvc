package com.spring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.user.entity.User;
import com.spring.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("registrationPage")
	public String showReg() {
		
		return "userReg";
	}
	
	@RequestMapping(value="registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user,ModelMap model) {
		int result =userService.saveUser(user);
		model.addAttribute("result","user create with id" + result);
		return "userReg";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
}
