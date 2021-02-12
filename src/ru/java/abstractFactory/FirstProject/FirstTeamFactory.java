package ru.java.abstractFactory.FirstProject;

import ru.java.abstractFactory.*;

public class FirstTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new AngryProjectManager();
    }
}
