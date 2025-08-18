package com.ecommerce.shipping;

public class StandardShipping implements ShippingStrategy {

	@Override
	public double calculate(double total) {
		return total + 10;
	}

}
