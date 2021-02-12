package ru.java.abstractFactory.SecondProject;

import ru.java.abstractFactory.ProjectManager;

public class LazyProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Lazy manager is sleeping");
    }
}
