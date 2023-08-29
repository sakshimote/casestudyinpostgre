package com.product.app.service;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.product.app.model.Product;


public interface ProductService {
	
	public Product addProduct(Product product, int merchantId, int categoryId);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(int productid);
	
	public List<Product> getProductByType(String producttype);
	
	public Product getProductByName( String productName);
	
	public List<Product> getProductByCategory( String category);
	
	public Product updateProducts(Product product, int productid);
	
	public String deleteProductById(int productid);

	public List<Product> getProductByMerchantId(int merchantId);
}
