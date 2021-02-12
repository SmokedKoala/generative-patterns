package ru.java.factory;

public class Dog implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}
