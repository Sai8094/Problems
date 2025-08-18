package com.foodorder.food.factory;

import com.foodorder.food.*;

public class FoodFactory {

	public static FoodItem createFood(String type, String name, double price, String cuisine) {
		switch (type.toLowerCase()) {
		case "pizza":
			return new Pizza(name, price, cuisine);
		case "burger":
			return new Burger(name, price, cuisine);
		case "drink":
			return new Drink(name, price, cuisine);
		default:
			System.out.println("Invalid Food Item");
			return null;
		}
	}

}
