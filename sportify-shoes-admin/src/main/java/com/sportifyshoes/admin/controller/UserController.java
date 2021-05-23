package com.sportifyshoes.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.sportifyshoes.admin.entities.Product;
import com.sportifyshoes.admin.entities.User;
import com.sportifyshoes.admin.services.ProductService;
import com.sportifyshoes.admin.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	
	@Autowired
	UserService userService;
	@Autowired
	ProductService productService;

	@GetMapping("/signup")
	public String userSignup() {
		
		
			
		return "user/register";
	}
	
	@PostMapping("/addUser")
	//@ResponseBody
	public String addUser(Model model, @RequestParam("name") String name,@RequestParam("psw") String pass,@RequestParam("email") String email,@RequestParam("city") String city) {
		
		if(userService.addUser(name, pass, email, city)) {
			List<Product> products = productService.displayProducts();
			model.addAttribute("productList", products);
			
			return "user/home";
				//return "user/userLogin";
		}
		
		return "user/register";
	}
	
	
	//@SuppressWarnings("null")
	@PostMapping("/checkUserLogin")
	public String checkUserLogin(@RequestParam("uname") String name,@RequestParam("pass") String pass, HttpServletRequest request) {
		
		 HttpSession session=request.getSession(); 
		List<User> user = userService.checkUser(name,pass);
		if(!user.isEmpty()) {
		session.setAttribute("user", user);
		//	session.setAttribute("name", "Atta");
		return "user/home";
		}else {
		return "user/userLogin";
		}
	}
	
}
