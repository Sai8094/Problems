package com.foodorder.order;

public interface OrderSubject {
	void registerObserver(OrderObserver o);
    void removeObserver(OrderObserver o);
    void notifyObservers();
}
