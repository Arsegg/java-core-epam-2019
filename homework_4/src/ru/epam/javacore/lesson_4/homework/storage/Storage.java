package ru.epam.javacore.lesson_4.homework.storage;

import ru.epam.javacore.lesson_4.homework.cargo.Cargo;
import ru.epam.javacore.lesson_4.homework.carrier.Carrier;
import ru.epam.javacore.lesson_4.homework.transportation.Transportation;

import java.io.PrintStream;

public class Storage {
    private Object[] storage;
    private int size;
    private float loadFactor;

    public Storage() {
        this(16);
    }

    public Storage(int capacity) {
        this(capacity, 1.5f);
    }

    public Storage(int capacity, float loadFactor) {
        this.storage = new Object[capacity];
        this.loadFactor = loadFactor;
    }

    public void add(Object object) {
        ensureCapacity();

        storage[size] = object;
        size++;
    }

    public void addCargo(Cargo cargo) {
        add(cargo);
    }

    public void addCarrier(Carrier carrier) {
        add(carrier);
    }

    public void addTransportation(Transportation transportation) {
        add(transportation);
    }

    private void ensureCapacity() {
        var newSize = size + 1;

        if (newSize > storage.length) {
            var newCapacity = (int) (storage.length * loadFactor);
            var newStorage = new Object[newCapacity];

            System.arraycopy(storage, 0, newStorage, 0, storage.length);
            storage = newStorage;
        }
    }

    public void printAll() {
        printAll(System.out);
    }

    public void printAll(PrintStream out) {
        out.println("Storage size is " + size);
        for (int i = 0; i < size; i++) {
            out.println(storage[i]);
        }
    }
}
