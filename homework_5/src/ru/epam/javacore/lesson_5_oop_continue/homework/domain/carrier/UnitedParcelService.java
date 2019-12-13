package ru.epam.javacore.lesson_5_oop_continue.homework.domain.carrier;

public class UnitedParcelService extends Carrier {
    public UnitedParcelService() {
        setName("United Parcel Service");
        setAddress("Sandy Springs, Georgia, US");
        setCarrierType(CarrierType.PLANE);
    }
}
