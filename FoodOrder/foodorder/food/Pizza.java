package com.foodorder.food;

public class Pizza implements FoodItem {

	private String name;
	private double price;
	private String cuisine;

	public Pizza(String name, double price, String cuisine) {
		this.name = name;
		this.price = price;
		this.cuisine = cuisine;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getCuisine() {
		return cuisine;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", price=" + price + ", cuisine=" + cuisine + "]";
	}

}
