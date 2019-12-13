package ru.epam.javacore.lesson_5_oop_continue.homework.domain.util;

import java.util.Iterator;

public class MyArrayList implements MyList {
    private Object[] array;
    private int size;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int capacity) {
        this.array = new Object[capacity];
    }

    public void add(Object object) {
        ensureCapacity();

        array[size] = object;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray(Object[] array) {
        System.arraycopy(this.array, 0, array, 0, size);
        return array;
    }

    private void ensureCapacity() {
        var capacity = array.length;
        var newSize = size + 1;

        if (newSize > array.length) {
            var newCapacity = capacity << 1;
            var newStorage = new Object[newCapacity];

            System.arraycopy(array, 0, newStorage, 0, capacity);
            array = newStorage;
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int position;

            @Override
            public boolean hasNext() {
                return position < size;
            }

            @Override
            public Object next() {
                return array[position++];
            }
        };
    }
}
