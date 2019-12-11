package ru.epam.javacore.lesson_4.homework.storage;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.Stream;

public class Storage {
    private Object[] storage = {};

    // Ultra-slow method - O(n ^ 2) time complexity and exact memory consumption (no pre-allocated items)
    public void add(Object object) {
        var storageStream = Arrays.stream(storage);
        var objectStream = Stream.of(object);
        storage = Stream.concat(storageStream, objectStream)
                .toArray();
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
