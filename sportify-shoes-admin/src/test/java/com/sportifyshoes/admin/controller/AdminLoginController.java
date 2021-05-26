<<<<<<< HEAD
package com.sportifyshoes.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sportifyshoes.admin.entities.PurchaseOrder;
import com.sportifyshoes.admin.entities.User;
import com.sportifyshoes.admin.services.AdminLoginService;
import com.sportifyshoes.admin.services.PurchaseOrderService;
import com.sportifyshoes.admin.services.UserService;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {

	@Autowired
	AdminLoginService adminservice;
	@Autowired
	UserService userService;
	@Autowired
	PurchaseOrderService purchaseOrderService;
	
	@PostMapping("/adminLogin")

	public String adminCheck(@RequestParam("adminName") String name, @RequestParam("adminPass") String pass) {
					
		if(adminservice.loginCheck(name, pass)) {
			
			return "main/home";
		}else {
			return "main/adminLogin";
		}
		
	}
	
	
	@GetMapping("/logout")
	
	public String logout() {
		
		return "/";
		
	}
	
	@GetMapping("/userList")
	public String getUserList(Model model) {
		
		List<User> users = userService.getUserList();
		
		model.addAttribute("users", users);
		
		return "admin/listUsers";
		
	}
	
	@GetMapping("/purchaseList")
	public String getPurchaseList(Model model) {
		
		List<PurchaseOrder> plists = purchaseOrderService.getPurchaseList();
		
		model.addAttribute("pLists", plists);
		
		return "admin/purchaseList";
		
	}
	
}
=======
package com.sportifyshoes.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sportifyshoes.admin.entities.User;
import com.sportifyshoes.admin.services.AdminLoginService;
import com.sportifyshoes.admin.services.UserService;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {

	@Autowired
	AdminLoginService adminservice;
	@Autowired
	UserService userService;
	
	@PostMapping("/adminLogin")

	public String adminCheck(@RequestParam("adminName") String name, @RequestParam("adminPass") String pass) {
					
		if(adminservice.loginCheck(name, pass)) {
			
			return "main/home";
		}else {
			return "main/adminLogin";
		}
		
	}
	
	
	@GetMapping("/logout")
	
	public String logout() {
		
		return "/";
		
	}
	
	@GetMapping("/userList")
	public String getUserList(Model model) {
		
		List<User> users = userService.getUserList();
		
		model.addAttribute("users", users);
		
		return "admin/listUsers";
		
	}
	
}
>>>>>>> a2f5e8553229cde5ec68f182e2ad7f75ddcff0de
