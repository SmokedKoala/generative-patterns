package ru.java.abstractFactory.SecondProject;

import ru.java.abstractFactory.Developer;

public class CDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C developer is typing code");
    }
}
