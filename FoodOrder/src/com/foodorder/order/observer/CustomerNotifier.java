package com.foodorder.order.observer;

import com.foodorder.order.Order;
import com.foodorder.order.OrderObserver;
import com.foodorder.order.OrderStatus;

public class CustomerNotifier implements OrderObserver {
	public void update(Order order, OrderStatus status) {
        System.out.printf("[Notify] Customer %s: Your order %s is now %s\n",
            order.getCustomerName(), order.getId(), status);
    }
	
}
