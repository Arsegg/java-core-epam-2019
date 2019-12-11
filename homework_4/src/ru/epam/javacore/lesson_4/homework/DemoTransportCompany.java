package ru.epam.javacore.lesson_4.homework;

import ru.epam.javacore.lesson_4.homework.cargo.Cargo;
import ru.epam.javacore.lesson_4.homework.carrier.Carrier;
import ru.epam.javacore.lesson_4.homework.storage.Storage;
import ru.epam.javacore.lesson_4.homework.transportation.Transportation;

public class DemoTransportCompany {
    public static void main(String[] args) {

        Cargo apple = new Cargo();
        apple.setId(1L);
        apple.setName("Apple");

        Storage storage = new Storage();
        storage.add(apple);

        Cargo orange = new Cargo();
        orange.setId(2L);
        orange.setName("Orange");
        storage.add(orange);

        Carrier company_1 = new Carrier();
        company_1.setId(1L);
        company_1.setName("Company 1");
        storage.add(company_1);

        Transportation transportation = new Transportation();
        transportation.setBillTo("Ivan Ivanich");
        transportation.setId(1L);
        transportation.setCargo(apple);
        transportation.setCarrier(company_1);
        storage.add(transportation);

        apple.setTransportations(
                new Transportation[]{transportation}
        );

        storage.printAll();
    }
}
