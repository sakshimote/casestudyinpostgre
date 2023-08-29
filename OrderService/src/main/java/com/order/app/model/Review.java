package com.order.app.model;




public class Review {
	
	
	private int reviewId;
	
	
	private String reviewText;
	
	private Integer rating;
	
	private Product product;
	
	private String userName;
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(int reviewId, String reviewText, Integer rating, Product product, String userName) {
		super();
		this.reviewId = reviewId;
		this.reviewText = reviewText;
		this.rating = rating;
		this.product = product;
		this.userName = userName;
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
