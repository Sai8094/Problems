package com.resturant;

public class OrderItem {
	
	void orderItem(FoodItem foodItem)
	{
		if(foodItem instanceof Pizza) {
			foodItem.itemIngredients();
			foodItem.cookingTime();
			foodItem.itemPrice();
		}
		
		else if(foodItem instanceof Burger) {
			foodItem.itemIngredients();
			foodItem.cookingTime();
			foodItem.itemPrice();
		}
		
		else if(foodItem instanceof Pasta) {
			foodItem.itemIngredients();
			foodItem.cookingTime();
			foodItem.itemPrice();
		}
			
	}
}
