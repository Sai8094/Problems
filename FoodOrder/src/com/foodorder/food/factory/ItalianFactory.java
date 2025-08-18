package com.foodorder.food.factory;

import com.foodorder.food.*;

public class ItalianFactory implements CuisineFactory {

	@Override
	public Pizza createPizza(String type) {
        if ("margherita".equalsIgnoreCase(type)) return new Pizza("Margherita", 6.5, "Italian");
        if ("pepperoni".equalsIgnoreCase(type)) return new Pizza("Pepperoni", 8.0, "Italian");
        return new Pizza(type, 7.0, "Italian");
    }
	@Override
    public Burger createBurger(String type) {
        return new Burger("Italianic " + type, 5.0, "Italian");
    }
	@Override
    public Drink createDrink(String type) {
        return new Drink(type + "Soda", 2.0, "Italian");
    }
}
