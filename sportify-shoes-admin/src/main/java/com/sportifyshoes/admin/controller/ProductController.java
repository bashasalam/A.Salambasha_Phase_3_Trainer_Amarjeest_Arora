package com.sportifyshoes.admin.controller;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sportifyshoes.admin.entities.Product;
import com.sportifyshoes.admin.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";
	@Autowired
	ProductService productService;
	
	@GetMapping("/addProduct")
	public String newProduct() {
		
		return "products/addProduct";
	}
	
	@PostMapping("/saveProduct")
	//@ResponseBody
	public String addProduct(Model model,@RequestParam("brandName") String brandName,@RequestParam("Category") String Category,@RequestParam("price") double price,@RequestParam("description") String description,@RequestParam("fileToUpload") MultipartFile[] files, String image ) {
		
		 StringBuilder fileName = new StringBuilder();
		 for(MultipartFile file : files) {
		  Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
		  fileName.append(file.getOriginalFilename()+" ");
		  
		  try {
			Files.write(fileNameAndPath,file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		//image =  fileName.toString();
		image =  fileName.toString();
		
		image =  "uploads/" + image;
		  		
		   if(productService.addProduct(brandName,Category,price,description,image)) {
		
			   return "redirect:/" ;
		   }else {
			   
			   return "products/addProduct";
		   }
	}
	
	@GetMapping("productList")
	public String showProducts(Model model) {
		
		List<Product> products = productService.displayProducts();
		model.addAttribute("productList", products);
		
		return "products/productList";
	}
	
	@PostMapping("/editProduct")
	public String editProductPage(Model model, @RequestParam("productId") long id) {
		
		Optional<Product> product = productService.findProduct(id);
		
	//	Product product = (Product) product;
		model.addAttribute("product", product);
		
		System.out.println(product);
		
		return "products/editProductPage";
	}

	@PostMapping("/deleteProduct")
	//@ResponseBody
	public String deleteProductPage( @RequestParam("deleteId") long id) {
		
		productService.deleteProduct(id);
		

		
		return "products/productList";
	}
	


	
}
