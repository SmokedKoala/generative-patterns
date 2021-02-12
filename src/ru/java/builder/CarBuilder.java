package ru.java.builder;

public abstract class CarBuilder {
    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildName();
    abstract void buildSpeed();
    abstract void buildCapacity();

    public Car getCar() {
        return car;
    }
}
