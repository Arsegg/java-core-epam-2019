package ru.epam.javacore.lesson_5_oop_continue.homework.domain.cargo;

public class Apple extends Cargo {
    public Apple() {
        setName("Apple");
        setWeight(176);
        setCargoType(CargoType.FOOD);
    }
}
