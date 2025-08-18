package com.foodorder.food.factory;

import com.foodorder.food.*;

public interface CuisineFactory {
	Pizza createPizza(String type);

	Burger createBurger(String type);

	Drink createDrink(String type);
}
