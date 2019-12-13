package ru.epam.javacore.lesson_5_oop_continue.homework.domain.util;

public interface MyList extends Iterable {
    void add(Object object);

    int size();

    Object[] toArray(Object[] array);
}
