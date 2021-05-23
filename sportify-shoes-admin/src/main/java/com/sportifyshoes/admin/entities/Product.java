package com.sportifyshoes.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long productId;
	private String brand;
	private String Category;
	private double price;
	private String description;
	private String image;
	public Product() {
		super();
	}
	public Product(String brand, String category, double price, String description, String image) {
		super();
		this.brand = brand;
		Category = category;
		this.price = price;
		this.description = description;
		this.image = image;
	}
	
	
		public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
		@Override
	public String toString() {
		return "Product [productId=" + productId + ", brand=" + brand + ", Category=" + Category + ", price=" + price
				+ ", description=" + description + "]";
	}
	
	
	

}
