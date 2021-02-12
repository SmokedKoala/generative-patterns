package ru.java.abstractFactory.FirstProject;

import ru.java.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer is typing code");
    }
}
