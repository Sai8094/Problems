package com.foodorder.order;

import java.util.ArrayList;
import java.util.List;

import com.foodorder.food.FoodItem;

public class Order {

    private static int counter = 1;

    private final String id;
    private final String customerName;
    private final List<FoodItem> items = new ArrayList<>();
    private OrderStatus status = OrderStatus.PLACED;
    private final List<OrderObserver> observers = new ArrayList<>();

    private Order(Builder builder) {
        this.id = "ORD" + counter++;
        this.customerName = builder.customerName;
        this.items.addAll(builder.items);
    }

    // Builder Pattern
    public static class Builder {
        private String customerName;
        private List<FoodItem> items = new ArrayList<>();

        public Builder(String customerName) {
            this.customerName = customerName;
        }

        public Builder addItem(FoodItem item) {
            items.add(item);
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public String getId() { return id; }
    public String getCustomerName() { return customerName; }
    public List<FoodItem> getItems() { return items; }
    public OrderStatus getStatus() { return status; }

    public double getTotal() {
        return items.stream().mapToDouble(FoodItem::getPrice).sum();
    }

    // Observer Pattern
    public void registerObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
        System.out.println("Order " + id + " status: " + newStatus);
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this, status);
        }
    }

    @Override
    public String toString() {
        return String.format("Order[id=%s, customer=%s, items=%s, total=%.2f, status=%s]",
                id, customerName, items, getTotal(), status);
    }
}
