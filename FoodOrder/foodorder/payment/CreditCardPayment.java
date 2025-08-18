package com.foodorder.payment;

public class CreditCardPayment implements PaymentStrategy {

	private final String cardNumber;

	public CreditCardPayment(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public boolean pay(double amount) {
		System.out.printf("Charging %.2f to card %s... OK\n", amount, cardNumber);
		return true; 
	}

	public String getName() {
		return "CreditCard";
	};

}
