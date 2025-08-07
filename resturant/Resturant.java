package com.resturant;

import java.util.Scanner;

public class Resturant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		OrderItem orderItem = new OrderItem();
		FoodItem foodItem = null;
		
		System.out.println("Items Available");
		System.out.println("1.Burger");
		System.out.println("2.Pasta");
		System.out.println("3.Pizza");
		String item = scanner.next();
		
		if(item.equalsIgnoreCase("Burger")) {
			foodItem = new Burger();
			orderItem.orderItem(foodItem);
		}
		else if(item.equalsIgnoreCase("Pasta")) {
			foodItem = new Pasta();
			orderItem.orderItem(foodItem);
		}
		else if(item.equalsIgnoreCase("Pizza")) {
			foodItem = new Pizza();
			orderItem.orderItem(foodItem);
		}
		
	}

}
