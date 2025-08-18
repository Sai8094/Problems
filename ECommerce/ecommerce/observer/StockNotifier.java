package com.ecommerce.observer;

import java.util.ArrayList;
import java.util.List;

public class StockNotifier {
	private List<StockObserver> observers = new ArrayList<>();

	public void addObserver(StockObserver o) {
		observers.add(o);
	}

	public void notifyStockChange(String product, int stock) {
		for (StockObserver o : observers)
			o.update(product, stock);
	}
}
