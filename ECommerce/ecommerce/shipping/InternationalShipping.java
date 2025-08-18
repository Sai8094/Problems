package com.ecommerce.shipping;

public class InternationalShipping implements ShippingStrategy {

	@Override
	public double calculate(double total) {
		return total + 25;
	}

}
