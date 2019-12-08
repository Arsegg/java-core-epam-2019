package com.github.arsegg.java_core_epam_2019;

public class Item {
    private String name;
    private Dimension dimension;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, Dimension dimension) {
        this(name);
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
