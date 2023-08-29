package com.product.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Category")
public class Category {
	
	
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int categoryId;
	
	private String categoryName;
	

	private String imgUrl;
	
	

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}



	public Category(int categoryId, String categoryName, String imgUrl) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.imgUrl = imgUrl;
	}

	public Category() {
		
	}
	
	

	
	
	
	
	
	

}
