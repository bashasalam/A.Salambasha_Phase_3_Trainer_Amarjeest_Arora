package com.sportifyshoes.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homepage() {
		
		return "main/home";
	}
	
	@RequestMapping("/admin/login")
	public String AdminLoginpage() {
		
		return "main/adminLogin";
	}
	
	@RequestMapping("/user/login")
	public String UserLoginpage() {
		
		return "main/userLogin";
	}

}
