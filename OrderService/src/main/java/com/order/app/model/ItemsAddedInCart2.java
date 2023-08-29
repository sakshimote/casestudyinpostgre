package com.order.app.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class ItemsAddedInCart2 {
	


	 private String productName;
	   private int quantity;
	   private double productPrice;
	   
	 
	   private List<String> productImage;
	   
	   
		private int productId;
		
		

	   
	public ItemsAddedInCart2() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ItemsAddedInCart2(int productId,String productName, int quantity, double productPrice, List<String> productImage) {
		super();
	
		this.productId=productId;
		this.productName = productName;
		this.quantity = quantity;
		this.productPrice = productPrice;
		this.productImage = productImage;
	}

	








	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public List<String> getProductImage() {
		return productImage;
	}

	public void setProductImage(List<String> productImage) {
		this.productImage = productImage;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	   
	   

}
