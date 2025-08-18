package com.foodorder.food.factory;

import com.foodorder.food.Burger;
import com.foodorder.food.Drink;
import com.foodorder.food.Pizza;

public class IndianFactory implements CuisineFactory {
	@Override
	public Pizza createPizza(String variant) {
        if ("tandoori".equalsIgnoreCase(variant)) return new Pizza("Tandoori Paneer", 7.5, "Indian");
        return new Pizza(variant + " (Indian-style)", 7.0, "Indian");
    }
	@Override
    public Burger createBurger(String variant) {
        return new Burger(variant + " Masala Burger", 4.5, "Indian");
    }
	@Override
    public Drink createDrink(String variant) {
        return new Drink("Masala " + variant, 1.5, "Indian");
    }

}
