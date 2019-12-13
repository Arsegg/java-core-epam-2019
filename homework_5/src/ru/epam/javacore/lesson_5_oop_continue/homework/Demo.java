package ru.epam.javacore.lesson_5_oop_continue.homework;

import ru.epam.javacore.lesson_5_oop_continue.homework.domain.cargo.Apple;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.cargo.Cargo;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.cargo.IPhone;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.carrier.Carrier;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.carrier.DHLExpress;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.carrier.UnitedParcelService;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.transportation.Transportation;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        final var N = 10;

        for (int i = 0; i < N; i++) {
            var cargo = new Cargo();
            cargo.setName("Cargo #" + i);

            Storage.addCargo(cargo);
        }
        Storage.addCargo(new Apple());
        Storage.addCargo(new IPhone());
        Storage.printAllCargos();

        for (int i = 0; i < N; i++) {
            var carrier = new Carrier();
            carrier.setName("Carrier #" + i);

            Storage.addCarrier(carrier);
        }
        Storage.addCarrier(new UnitedParcelService());
        Storage.addCarrier(new DHLExpress());
        Storage.printAllCarriers();

        for (int i = 0; i < N; i++) {
            var transportation= new Transportation();
            transportation.setDescription("Transportation #" + i);

            Storage.addTransportation(transportation);
        }
        Storage.printAllTransportations();

        var cargos = Storage.getAllCargos();
        System.out.println(Arrays.toString(cargos));

        var carriers = Storage.getAllCarriers();
        System.out.println(Arrays.toString(carriers));

        var transportations = Storage.getAllTransportations();
        System.out.println(Arrays.toString(transportations));
    }
}
