package com.foodorder.order.observer;

import com.foodorder.order.Order;
import com.foodorder.order.OrderObserver;
import com.foodorder.order.OrderStatus;

public class KitchenDisplay implements OrderObserver {
	public void update(Order order, OrderStatus status) {
		System.out.printf("[Kitchen] Order %s status for kitchen: %s\n", order.getId(), status);
	}
}
