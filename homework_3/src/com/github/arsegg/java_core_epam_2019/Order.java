package com.github.arsegg.java_core_epam_2019;

public class Order {
    private Executor executor;
    private Route route;
    private Item[] items;

    public Order(Executor executor, Route route, Item[] items) {
        this.executor = executor;
        this.route = route;
        this.items = items;
    }

    public Executor getExecutor() {
        return executor;
    }

    public Route getRoute() {
        return route;
    }

    public Item[] getItems() {
        return items;
    }
}
