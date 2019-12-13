package ru.epam.javacore.lesson_5_oop_continue.homework.domain.cargo;

import ru.epam.javacore.lesson_5_oop_continue.homework.domain.common.Base;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.transportation.Transportation;

import java.util.Arrays;

public class Cargo extends Base {
    private String name;
    private int weight;
    private CargoType cargoType;
    private Transportation[] transportations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public CargoType getCargoType() {
        return cargoType;
    }

    public void setCargoType(CargoType cargoType) {
        this.cargoType = cargoType;
    }

    public Transportation[] getTransportations() {
        return transportations;
    }

    public void setTransportations(Transportation[] transportations) {
        this.transportations = transportations;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", cargoType=" + cargoType +
                ", transportations=" + Arrays.toString(transportations) +
                '}';
    }
}
