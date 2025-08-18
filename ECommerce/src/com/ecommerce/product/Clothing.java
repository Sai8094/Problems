package com.ecommerce.product;

public class Clothing implements Product {
	private String name;
	private double price;

	public Clothing(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

}
