package com.ecommerce.shipping;

public class ExpressShipping implements ShippingStrategy {

	@Override
	public double calculate(double total) {
		return total + 20;
	}

}
