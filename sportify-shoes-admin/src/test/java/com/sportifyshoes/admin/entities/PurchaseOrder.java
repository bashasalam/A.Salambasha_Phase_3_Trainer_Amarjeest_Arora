package com.sportifyshoes.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long purchseId;
	private String company;
	private String product;
	private String category; 
	private long quantity;
	public PurchaseOrder() {
		super();
	}
	public PurchaseOrder(String company, String product, String category, long quantity) {
		super();
		this.company = company;
		this.product = product; 
		this.category = category;
		this.quantity = quantity;
	}

	public long getPurchseId() {
		return purchseId;
	}
	public void setPurchseId(long purchseId) {
		this.purchseId = purchseId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "PurchaseOrder [purchseId=" + purchseId + ", company=" + company + ", product=" + product + ", category="
				+ category + ", quantity=" + quantity + "]";
	}

	
	
}
