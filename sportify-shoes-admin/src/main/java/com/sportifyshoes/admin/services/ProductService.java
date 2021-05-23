package com.sportifyshoes.admin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sportifyshoes.admin.dao.ProductRepository;
import com.sportifyshoes.admin.entities.Product;
//import com.sportifyshoes.admin.entities.User;

@Service
public class ProductService {

	@Autowired
	ProductRepository prorepo;
	public boolean addProduct(String brandName, String Category, double price, String description, String image) {
		// TODO Auto-generated method stub
		
if(prorepo.save(new Product(brandName, Category, price, description,image)) != null) {
			
			return true;
		}else {
			
			return false;
		}

	}
	
	public List<Product> displayProducts(){
		
		List<Product> productList = prorepo.findAll();
		
		return productList;
		
	}

	public Optional<Product> findProduct(Long id) {
		// TODO Auto-generated method stub
		Optional<Product> product = prorepo.findById(id);
		
		return product;
	}

	public boolean deleteProduct(long id) {
		
		prorepo.deleteById(id);
		
			return true;
	
		
			
	}
	

}
