package com.github.arsegg.java_core_epam_2019;

public class Executor {
    private String name;
    private Order[] orders;

    public Executor(String name) {
        this.name = name;
    }

    public Executor(String name, Order[] orders) {
        this(name);
        this.orders = orders;
    }

    public Order createOrder(Route route, Item[] items) {
        return new Order(this, route, items);
    }

    public String getName() {
        return name;
    }

    public Order[] getOrders() {
        return orders;
    }
}
