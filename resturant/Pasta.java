package com.resturant;

public class Pasta implements FoodItem{
	private double price = 150;
	private String cookingTime = "15 Minutes";

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCookingTime() {
		return cookingTime;
	}

	public void setCookingTime(String cookingTime) {
		this.cookingTime = cookingTime;
	}
	
	@Override
	public void cookingTime() {
		System.out.println("Cooking Time:" + this.cookingTime);
	}

	@Override
	public void itemPrice() {
		System.out.println("Item Price: "+ this.price);
	}
	@Override
	public void itemIngredients() {
		System.out.println("Ingredients: Pasta, Vegetables,Masala,Cheese");
	}

}
