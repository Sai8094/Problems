package com.foodorder.service;

import com.foodorder.db.DBConnection;
import com.foodorder.order.Order;
import com.foodorder.order.OrderStatus;
import com.foodorder.order.observer.CustomerNotifier;
import com.foodorder.order.observer.KitchenDisplay;
import com.foodorder.payment.PaymentStrategy;

public class OrderService {
	 public Order placeOrder(Order.Builder builder, PaymentStrategy payment) {
	        Order order = builder.build();

	        order.registerObserver(new CustomerNotifier());
	        order.registerObserver(new KitchenDisplay());

	        
	        DBConnection.getInstance().save("order:" + order.getId(), order);
	        double amount = order.getTotal();
	        System.out.printf("Processing payment method: %s for amount %.2f\n", payment.getName(), amount);
	        boolean paid = payment.pay(amount);
	        if (!paid) {
	            order.updateStatus(OrderStatus.CANCELLED);
	            System.out.println("Payment failed. Order cancelled.");
	            return order;
	        }

	        order.updateStatus(OrderStatus.PREPARING);
	        simulateKitchenFlow(order);
	        return order;
	    }

	    private void simulateKitchenFlow(Order order) {
	        try { Thread.sleep(200); } catch (InterruptedException ignored) {}
	        order.updateStatus(OrderStatus.READY);
	        try { Thread.sleep(200); } catch (InterruptedException ignored) {}
	        order.updateStatus(OrderStatus.OUT_FOR_DELIVERY);
	        try { Thread.sleep(200); } catch (InterruptedException ignored) {}
	        order.updateStatus(OrderStatus.DELIVERED);
	    }
}
