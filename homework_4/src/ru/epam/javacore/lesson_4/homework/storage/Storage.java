package ru.epam.javacore.lesson_4.homework.storage;

import java.io.PrintStream;

public class Storage {
    private Object[] storage = {};

//    // Ultra-slow method - O(n) time complexity and exact memory consumption (no pre-allocated items)
//    public void add(Object object) {
//        var storageStream = Arrays.stream(storage);
//        var objectStream = Stream.of(object);
//        storage = Stream.concat(storageStream, objectStream)
//                .toArray();
//    }

    // Another ultra-slow method - O(n) time complexity and exact memory consumption (no pre-allocated items)
    public void add(Object object) {
        var newStorage = new Object[storage.length + 1];
        System.arraycopy(storage, 0, newStorage, 0, storage.length);
        newStorage[newStorage.length - 1] = object;

        storage = newStorage;
    }

    public void printAll() {
        printAll(System.out);
    }

    public void printAll(PrintStream out) {
        out.println("Storage size is " + storage.length);
        for (Object o : storage) {
            out.println(o);
        }
    }
}
