package com.github.arsegg.java_core_epam_2019;

public class Position {
    private float latitude;
    private float longitude;
    private Float altitude;

    public Position(float latitude, float longitude, Float altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public Float getAltitude() {
        return altitude;
    }
}
