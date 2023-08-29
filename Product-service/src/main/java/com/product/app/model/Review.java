package com.product.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Review")
public class Review {
	
	@Id
	private int reviewId;
	
	
	private String reviewText;
	
	private Integer rating;
	
	@ManyToOne( cascade = CascadeType.PERSIST)
	@JoinColumn(name = "productreviewId",referencedColumnName = "productid")
	private Product product;
	
	private int productId;
	
	
	
	private String userName;
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Review(int reviewId, String reviewText, Integer rating, Product product, int productId,
			String userName) {
		super();
		this.reviewId = reviewId;
		this.reviewText = reviewText;
		this.rating = rating;
		this.product = product;
		this.productId = productId;
		this.userName = userName;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int i) {
		this.productId = i;
	}



	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}



	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}







}
