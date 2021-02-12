package ru.java.builder;

public class NissanBuilder extends CarBuilder {

    @Override
    void buildName() {
        car.setName("Nissan X‑Trail");
    }

    @Override
    void buildSpeed() {
        car.setSpeed(180);
    }

    @Override
    void buildCapacity() {
        car.setCapacity(6);
    }
}
