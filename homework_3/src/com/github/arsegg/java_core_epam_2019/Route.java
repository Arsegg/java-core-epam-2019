package com.github.arsegg.java_core_epam_2019;

import java.time.LocalDateTime;

public class Route {
    private Waypoint[] waypoints;
    private Type type;
    private TransportMode[] modes;
    private RoadFeature[] features;
    private LocalDateTime departure;
    private LocalDateTime arrival;

    public Route(Waypoint[] waypoints, Type type, TransportMode[] modes, RoadFeature[] features,
                 LocalDateTime departure, LocalDateTime arrival) {
        this.waypoints = waypoints;
        this.type = type;
        this.modes = modes;
        this.features = features;
        this.departure = departure;
        this.arrival = arrival;
    }

    public Waypoint[] getWaypoints() {
        return waypoints;
    }

    public Type getType() {
        return type;
    }

    public TransportMode[] getModes() {
        return modes;
    }

    public RoadFeature[] getFeatures() {
        return features;
    }

    public enum Type {
        FASTEST,
        SHORTEST,
        BALANCED
    }

    public enum TransportMode {
        CAR,
        PEDESRTIAN,
        CAR_HOV,
        PUBLIC_TRANSPORT,
        PUBLIC_TRANSPORT_TIME_TABLE,
        TRUCK,
        BICYCLE
    }

    public enum RoadFeature {
        TOLL_ROAD,
        MOTORWAY,
        BOAT_FERRY,
        RAIL_FERRY,
        TUNNEL,
        DIRT_ROAD,
        PARK
    }
}
