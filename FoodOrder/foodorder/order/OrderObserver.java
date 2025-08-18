package com.foodorder.order;

public interface OrderObserver {
	void update(Order order, OrderStatus status);
}
