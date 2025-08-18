package com.foodorder;

import com.foodorder.db.DBConnection;
import com.foodorder.food.*;
import com.foodorder.food.factory.*;
import com.foodorder.order.Order;
import com.foodorder.payment.*;
import com.foodorder.service.*;

public class MainApp {

	public static void main(String[] args) {

		CuisineFactory italian = new ItalianFactory();
		FoodItem pizza = italian.createPizza("Margherita");
		FoodItem drink = italian.createDrink("Cola");

		CuisineFactory indian = new IndianFactory();
		FoodItem burger = indian.createBurger("Paneer");
		FoodItem spicyDrink = indian.createDrink("Chaas");

		FoodItem customPizza = new Pizza("Custom BBQ", 9.5, "Fusion");

		Order.Builder builder = new Order.Builder("Sai Gopi").addItem(pizza).addItem(burger).addItem(drink)
				.addItem(customPizza).addItem(spicyDrink);

		PaymentStrategy payment = new UpiPayment("saigopi@upi");

		OrderService service = new OrderService();
		Order order = service.placeOrder(builder, payment);

		System.out.println("Final order: " + order);

		Object savedStatus = DBConnection.getInstance().get("order:" + order.getId() + ":status");
		System.out.println("Persisted status in DB: " + savedStatus);
	}
}
