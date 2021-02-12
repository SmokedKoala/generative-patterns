package ru.java.builder;

public class Engineer {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildCar(){
        builder.createCar();
        builder.buildName();
        builder.buildSpeed();
        builder.buildCapacity();

        Car car = builder.getCar();

        return car;
    }
}
