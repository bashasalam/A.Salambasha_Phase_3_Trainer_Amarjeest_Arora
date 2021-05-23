package com.sportifyshoes.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sportifyshoes.admin.entities.Product;
import com.sportifyshoes.admin.services.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	ProductService productService;
	
//	public String homepage() {
//		
//		
//		return "main/home";
//	}
	
	@RequestMapping("/admin/login")
	public String AdminLoginpage( Model model) {
		List<Product> products = productService.displayProducts();
		model.addAttribute("productList", products);
		
		return "admin/home";
		//return "main/adminLogin";
	}
	
	@RequestMapping("/user/login")
	public String UserLoginpage() {
		
		return "user/userLogin";
	}
	
	@RequestMapping("/")
	public String displayProductsInHome(Model model) throws JsonProcessingException {
		
		List<Product> products = productService.displayProducts();
		model.addAttribute("productList", products);
		
		return "main/home";
		
	}


}
