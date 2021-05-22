package com.sportifyshoes.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sportifyshoes.admin.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	
	@Autowired
	UserService userService;

	@GetMapping("/signup")
	public String userSignup() {
		
		
			
		return "user/register";
	}
	
	@PostMapping("/addUser")
	@ResponseBody
	public String addUser(@RequestParam("name") String name,@RequestParam("psw") String pass,@RequestParam("email") String email,@RequestParam("city") String city) {
		
		if(userService.addUser(name, pass, email, city)) {
			
			
			return "Registered successfully";
		}
		
		return "user/register";
	}
	
}
