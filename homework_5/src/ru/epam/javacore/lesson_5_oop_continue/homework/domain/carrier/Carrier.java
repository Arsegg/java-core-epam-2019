package ru.epam.javacore.lesson_5_oop_continue.homework.domain.carrier;

import ru.epam.javacore.lesson_5_oop_continue.homework.domain.common.Base;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.transportation.Transportation;

import java.util.Arrays;

public class Carrier extends Base {
    private String name;
    private String address;
    private CarrierType carrierType;
    private Transportation[] transportations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CarrierType getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(CarrierType carrierType) {
        this.carrierType = carrierType;
    }

    public Transportation[] getTransportations() {
        return transportations;
    }

    public void setTransportations(Transportation[] transportations) {
        this.transportations = transportations;
    }

    @Override
    public String toString() {
        return "Carrier{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", carrierType=" + carrierType +
                ", transportations=" + Arrays.toString(transportations) +
                '}';
    }
}
