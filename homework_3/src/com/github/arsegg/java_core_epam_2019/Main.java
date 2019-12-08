package com.github.arsegg.java_core_epam_2019;

public class Main {
    public static void main(String[] args) {
        var pizza = new Item("Pizza", new Dimension(0.045f, 0.33f, 0.33f));
        var pasta = new Item("Pasta");

        var ivan = new Executor("Ivan", new Order[1]);
        var order = ivan.createOrder(
                new Route(
                        new Waypoint[]{
                                new Waypoint("Невский проспект", new Position(59.935475f, 30.327452f)),
                                new Waypoint("наб. р. Мойки, 12", new Position(59.941128f, 30.321155f))},
                        Route.Type.FASTEST,
                        new Route.TransportMode[]{
                                Route.TransportMode.PEDESRTIAN,
                                Route.TransportMode.BICYCLE},
                        new Route.RoadFeature[]{
                                Route.RoadFeature.MOTORWAY,
                                Route.RoadFeature.DIRT_ROAD,
                                Route.RoadFeature.PARK}),
                new Item[]{pizza, pasta});
        ivan.getOrders()[0] = order;
    }
}
