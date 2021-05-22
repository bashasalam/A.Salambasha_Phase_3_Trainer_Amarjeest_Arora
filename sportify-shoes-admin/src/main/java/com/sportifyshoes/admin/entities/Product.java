package com.sportifyshoes.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long productId;
	private String name;
	private String Category;
	private double price;
	private String description;
	private String image;
	public Product() {
		super();
	}
	public Product(String name, String category, double price, String description, String image) {
		super();
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Product [productId=" + productId + ", name=" + name + ", Category=" + Category + ", price=" + price
				+ ", description=" + description + "]";
	}
	
	
	

}
