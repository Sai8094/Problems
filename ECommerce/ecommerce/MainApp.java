package com.ecommerce;

import com.ecommerce.cart.Cart;
import com.ecommerce.observer.StockNotifier;
import com.ecommerce.order.Order;
import com.ecommerce.product.ProductFactory;
import com.ecommerce.shipping.ExpressShipping;
import com.ecommerce.product.factory.*;

public class MainApp {

	public static void main(String[] args) {

		StockNotifier notifier = new StockNotifier();
		notifier.addObserver((name, stock) -> System.out.println("Stock updated for " + name + ": " + stock + " left"));

		Cart cart = Cart.getInstance(notifier);

		cart.addItem(ProductFactory.createProduct("electronics", "Phone", 500));
		cart.addItem(ProductFactory.createProduct("books", "Java Guide", 40));

		Factory usFactory = new USFactory();
		cart.addItem(usFactory.createClothing());

		Order order = new Order.Builder("Ram").addItem(ProductFactory.createProduct("clothing", "T-shirt", 20))
				.addItem(ProductFactory.createProduct("books", "Design Patterns", 50)).shipping(new ExpressShipping())
				.coupon("DISCOUNT10").build();

		System.out.println(order);
	}
}
