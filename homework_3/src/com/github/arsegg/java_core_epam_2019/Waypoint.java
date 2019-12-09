package com.github.arsegg.java_core_epam_2019;

public class Waypoint {
    private String label;
    private Position position;
    private Type type;

    public Waypoint(String label, Position position, Type type) {
        this.label = label;
        this.position = position;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public Position getPosition() {
        return position;
    }

    public enum Type {
        STOP_OVER,
        PASS_THROUGH
    }
}
