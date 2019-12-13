package ru.epam.javacore.lesson_5_oop_continue.homework.domain.common;

import ru.epam.javacore.lesson_5_oop_continue.homework.IdGenerator;

public abstract class Base {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void generateAndSetNewId() {
        setId(IdGenerator.generateId());
    }
}
