package ru.epam.javacore.lesson_5_oop_continue.homework.domain.cargo;

public class IPhone extends Cargo {
    public IPhone() {
        setName("IPhone");
        setWeight(135);
        setCargoType(CargoType.COMPUTERS);
    }
}
