package com.ecommerce.cart;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.observer.StockNotifier;
import com.ecommerce.product.Product;

public class Cart {

	private static Cart instance;
	private List<Product> items = new ArrayList<>();
	private StockNotifier notifier;

	private Cart(StockNotifier notifier) {
		this.notifier = notifier;
	}

	public static Cart getInstance(StockNotifier notifier) {
		if (instance == null)
			instance = new Cart(notifier);
		return instance;
	}

	public void addItem(Product p) {
		items.add(p);
		notifier.notifyStockChange(p.getName(), 10);
	}

	public List<Product> getItems() {
		return items;
	}
}
