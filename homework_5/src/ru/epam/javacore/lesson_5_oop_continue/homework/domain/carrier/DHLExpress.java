package ru.epam.javacore.lesson_5_oop_continue.homework.domain.carrier;

public class DHLExpress extends Carrier {
    public DHLExpress() {
        setName("DHL Express");
        setAddress("Bonn, Germany");
        setCarrierType(CarrierType.SHIP);
    }
}
