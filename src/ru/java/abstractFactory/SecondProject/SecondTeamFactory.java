package ru.java.abstractFactory.SecondProject;

import ru.java.abstractFactory.Developer;
import ru.java.abstractFactory.ProjectManager;
import ru.java.abstractFactory.ProjectTeamFactory;
import ru.java.abstractFactory.Tester;

public class SecondTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new CDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new LazyProjectManager();
    }
}
