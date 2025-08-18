package com.foodorder.payment;

public class UpiPayment implements PaymentStrategy {
	private final String upiId;

	public UpiPayment(String upiId) {
		this.upiId = upiId;
	}

	public boolean pay(double amount) {
		System.out.printf("Processing UPI payment of %.2f from %s... OK\n", amount, upiId);
		return true;
	}

	public String getName() {
		return "UPI";
	}
}
