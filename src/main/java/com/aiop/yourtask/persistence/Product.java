package com.aiop.yourtask.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="productId")
	private int productId;

	@Column(name="productName")
	private String productName;
	
	@Column(name="productDescription")
	private String productDescription;
	
	@Column(name="productImage")
	private String productImage;
	
	@Column(name="productPrice")
	private double productPrice;
	
	@Column(name="productAvailablequantity")
	private int productAvailablequantity;
	
	@Column(name="userId")
	private int userId;
	
	
	public Product() {}


	public Product(int productId, String productName, String productDescription, String productImage,
			double productPrice, int productAvailablequantity, int userId) {
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.productAvailablequantity = productAvailablequantity;
		this.userId = userId;
	}


	public Product(String productName, String productDescription, String productImage, double productPrice,
			int productAvailablequantity, int userId) {
		this.productName = productName;
		this.productDescription = productDescription;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.productAvailablequantity = productAvailablequantity;
		this.userId = userId;
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


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public String getProductImage() {
		return productImage;
	}


	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public int getProductAvailablequantity() {
		return productAvailablequantity;
	}


	public void setProductAvailablequantity(int productAvailablequantity) {
		this.productAvailablequantity = productAvailablequantity;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productImage=" + productImage + ", productPrice=" + productPrice
				+ ", productAvailablequantity=" + productAvailablequantity + ", userId=" + userId + "]";
	}
	
	


}