package com.ecommerce.order;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.product.Product;
import com.ecommerce.shipping.ShippingStrategy;
import com.ecommerce.shipping.StandardShipping;

public class Order {
	private String customer;
	private List<Product> items;
	private double total;
	private ShippingStrategy shipping;
	private String coupon;

	private Order(Builder b) {
		this.customer = b.customer;
		this.items = b.items;
		this.shipping = b.shipping;
		this.coupon = b.coupon;
		this.total = calcTotal();
	}

	private double calcTotal() {
		double sum = 0;
		for (Product p : items)
			sum += p.getPrice();
		if (coupon != null)
			sum *= 0.9;
		return shipping.calculate(sum);
	}

	public String toString() {
		return "Order for " + customer + " total:" + total;
	}

	public static class Builder {
		private String customer;
		private List<Product> items = new ArrayList<>();
		private ShippingStrategy shipping = new StandardShipping();
		private String coupon;

		public Builder(String customer) {
			this.customer = customer;
		}

		public Builder addItem(Product p) {
			items.add(p);
			return this;
		}

		public Builder shipping(ShippingStrategy s) {
			shipping = s;
			return this;
		}

		public Builder coupon(String c) {
			coupon = c;
			return this;
		}

		public Order build() {
			return new Order(this);
		}
	}
}
