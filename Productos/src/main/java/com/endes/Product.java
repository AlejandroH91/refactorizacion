package com.endes;

public class Product {
	private String ProductName;
	private double ProductsPrice;
	
	public Product(String productName, double productsPrice) {
		
		ProductName = productName;
		ProductsPrice = productsPrice;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public double getProductsPrice() {
		return ProductsPrice;
	}

	public void setProductsPrice(double productsPrice) {
		ProductsPrice = productsPrice;
	}
	
	
}
