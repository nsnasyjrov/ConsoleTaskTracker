package Project;

import Project.Database.DatabaseInitializer;

public class Test {
    public static void main(String[] args) {
        DatabaseInitializer initializer = new DatabaseInitializer();
        initializer.initialize();
    }
}
