package com.github.arsegg.java_core_epam_2019;

public class Dimension {
    private Float height;
    private Float width;
    private Float length;

    public Dimension(Float height) {
        this.height = height;
    }

    public Dimension(Float height, Float width) {
        this(height);
        this.width = width;
    }

    public Dimension(Float height, Float width, Float length) {
        this(height, width);
        this.length = length;
    }

    public Float getHeight() {
        return height;
    }

    public Float getWidth() {
        return width;
    }

    public Float getLength() {
        return length;
    }
}
