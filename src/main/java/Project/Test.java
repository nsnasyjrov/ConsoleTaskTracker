package Project;

import Project.Database.DatabaseInitializer;
import Project.Task.TaskControlMethods;

public class Test {
    static DatabaseInitializer databaseInitializer = new DatabaseInitializer();
    static TaskControlMethods controlMethods = new TaskControlMethods();

    public static void main(String[] args) {
        databaseInitializer.initialize();
        controlMethods.createTask("Исправить багу на бэкенде");
    }
}
