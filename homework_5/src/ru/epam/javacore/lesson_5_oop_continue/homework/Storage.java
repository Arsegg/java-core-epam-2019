package ru.epam.javacore.lesson_5_oop_continue.homework;

import ru.epam.javacore.lesson_5_oop_continue.homework.domain.cargo.Cargo;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.carrier.Carrier;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.transportation.Transportation;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.util.MyArrayList;
import ru.epam.javacore.lesson_5_oop_continue.homework.domain.util.MyList;

public class Storage {
    private static MyList cargos = new MyArrayList();
    private static MyList carriers = new MyArrayList();
    private static MyList transportations = new MyArrayList();

    public static void addCargo(Cargo cargo) {
        cargo.generateAndSetNewId();
        cargos.add(cargo);
    }

    public static void printAllCargos() {
        printAll(cargos);
    }

    public static Cargo[] getAllCargos() {
        return (Cargo[]) cargos.toArray(new Cargo[cargos.size()]);
    }

    public static Cargo getCargoById(Long id) {
        for (Cargo cargo : getAllCargos()) {
            if (cargo.getId().equals(id)) {
                return cargo;
            }
        }

        return null;
    }


    public static Cargo getCargoByName(String name) {
        for (Cargo cargo : getAllCargos()) {
            if (cargo.getName().equals(name)) {
                return cargo;
            }
        }

        return null;
    }

    public static void addCarrier(Carrier carrier) {
        carrier.generateAndSetNewId();
        carriers.add(carrier);
    }

    public static void printAllCarriers() {
        printAll(carriers);
    }

    public static Carrier[] getAllCarriers() {
        return (Carrier[]) carriers.toArray(new Carrier[cargos.size()]);
    }

    public static Carrier getCarrierById(Long id) {
        for (Carrier carrier : getAllCarriers()) {
            if (carrier.getId().equals(id)) {
                return carrier;
            }
        }

        return null;
    }


    public static Carrier getCarrierByName(String name) {
        for (Carrier carrier : getAllCarriers()) {
            if (carrier.getName().equals(name)) {
                return carrier;
            }
        }

        return null;
    }

    public static void addTransportation(Transportation transportation) {
        transportation.generateAndSetNewId();
        transportations.add(transportation);
    }

    public static void printAllTransportations() {
        printAll(transportations);
    }


    public static Transportation[] getAllTransportations() {
        return (Transportation[]) transportations.toArray(new Transportation[cargos.size()]);
    }

    public static Transportation getTransportationById(Long id) {
        for (Transportation transportation : getAllTransportations()) {
            if (transportation.getId().equals(id)) {
                return transportation;
            }
        }

        return null;
    }

    private static void printAll(MyList arrayList) {
        for (Object object : arrayList) {
            System.out.println(object.toString());
        }
    }
}
