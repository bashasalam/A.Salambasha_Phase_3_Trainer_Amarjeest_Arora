package com.sportifyshoes.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sportifyshoes.admin.services.AdminLoginService;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {

	@Autowired
	AdminLoginService adminservice;
	
	@PostMapping("/adminLogin")

	public String adminCheck(@RequestParam("adminName") String name, @RequestParam("adminPass") String pass) {
					
		if(adminservice.loginCheck(name, pass)) {
			return "admin/adminDashboard";
		}else {
			return "main/adminLogin";
		}
		
	}
}
