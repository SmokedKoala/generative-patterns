package ru.java;

import ru.java.abstractFactory.*;
import ru.java.abstractFactory.FirstProject.FirstTeamFactory;
import ru.java.abstractFactory.SecondProject.SecondTeamFactory;
import ru.java.builder.*;
import ru.java.factory.Animal;
import ru.java.factory.AnimalFactory;
import ru.java.factory.CatFactory;
import ru.java.factory.DogFactory;
import ru.java.prototype.Book;
import ru.java.prototype.BookFactory;

public class Main {

    public static void main(String[] args) {
        factoryTest();
        abstractFactoryTest();
        builderTest();
        prototypeTest();
    }

    static void prototypeTest(){
        System.out.println("\nPrototype method is testing");
        Book original = new Book(1867, "War and Peace", "Leo Tolstoy");
        System.out.println("original: "+ original);
        BookFactory bookFactory = new BookFactory(original);
        Book copy = bookFactory.cloneBook();
        System.out.println("copy: "+ copy);
    }

    static void builderTest(){
        System.out.println("\nBuilder method is testing");
        Engineer engineer = new Engineer();
        Car car;
        engineer.setBuilder(new NissanBuilder());
        car = engineer.buildCar();
        System.out.println(car);

        engineer.setBuilder(new ChevroletBuilder());
        car = engineer.buildCar();
        System.out.println(car);
    }

    static void abstractFactoryTest(){
        System.out.println("\nAbstract Factory method is testing");
        ProjectTeamFactory firstProjectTeamFactory = new FirstTeamFactory();
        Developer developer = firstProjectTeamFactory.getDeveloper();
        Tester tester = firstProjectTeamFactory.getTester();
        ProjectManager projectManager = firstProjectTeamFactory.getProjectManager();
        System.out.println("First project:");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

        ProjectTeamFactory secondProjectTeamFactory = new SecondTeamFactory();
        Developer developer2 = secondProjectTeamFactory.getDeveloper();
        Tester tester2 = secondProjectTeamFactory.getTester();
        ProjectManager projectManager2 = secondProjectTeamFactory.getProjectManager();
        System.out.println("Second project:");
        developer2.writeCode();
        tester2.testCode();
        projectManager2.manageProject();
    }

    static void factoryTest(){
        AnimalFactory animalFactory;
        Animal animal;

        System.out.println("\nFactory method is testing");
        animalFactory = new DogFactory();
        animal = animalFactory.createAnimal();
        animal.makeNoise();

        animalFactory = new CatFactory();
        animal = animalFactory.createAnimal();
        animal.makeNoise();
    }

}
