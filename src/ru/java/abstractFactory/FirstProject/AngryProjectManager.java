package ru.java.abstractFactory.FirstProject;

import ru.java.abstractFactory.ProjectManager;

public class AngryProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Angry manager is noticing about deadlines");
    }
}
