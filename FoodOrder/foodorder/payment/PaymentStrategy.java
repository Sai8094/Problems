package com.foodorder.payment;

public interface PaymentStrategy {
	boolean pay(double amount);

	String getName();
}
