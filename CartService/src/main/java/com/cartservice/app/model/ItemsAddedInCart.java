package com.cartservice.app.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity

public class ItemsAddedInCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	
	private int productId;
	
	
	 private String productName;
	 
	   private int quantity;
	   

	private double productPrice;
	   
	   @ElementCollection
	   private List<String> productImage;
	   
	


	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}





	public ItemsAddedInCart(int productId, String productName, int quantity, double productPrice,
			List<String> productImage) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.productPrice = productPrice;
		this.productImage = productImage;
	}


	public List<String> getProductImage() {
		return productImage;
	}


	public void setProductImage(List<String> productImage) {
		this.productImage = productImage;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public ItemsAddedInCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemsAddedInCart(String productName, int quantity) {
		super();
		this.productName = productName;
		this.quantity = quantity;
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
