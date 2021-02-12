package ru.java.builder;

public class ChevroletBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Chevrolet Tahoe");
    }

    @Override
    void buildSpeed() {
        car.setSpeed(200);
    }

    @Override
    void buildCapacity() {
        car.setCapacity(5);
    }
}
