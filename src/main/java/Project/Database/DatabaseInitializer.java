package Project.Database;

import Project.Task.TaskControlMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    private static final String DB_URL = "jdbc:mysql://localhost:3307";
    private static final String USER = "nail"; // Замените на вашего пользователя
    private static final String PASS = "springcourse"; // Замените на ваш пароль

    public void initialize() {
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)) {
            System.out.println("Подключение к MySQL успешно установлено.");

            // Создание базы данных
            createDatabase(connection);

            // Подключение к созданной базе данных
            try (Connection dbConnection = DriverManager.getConnection(DB_URL + "/taskschema", USER, PASS)) {
                System.out.println("Подключение к базе данных taskschema успешно установлено.");

                // Создание таблицы для задач
                createTaskTable(dbConnection);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createDatabase(Connection connection) throws SQLException, SQLException {
        String createDbQuery = "CREATE DATABASE IF NOT EXISTS taskschema";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createDbQuery);
            System.out.println("База данных taskschema создана или уже существует.");
        }
    }

    private static void createTaskTable(Connection connection) throws SQLException {
        String createTableQuery = """
                CREATE TABLE IF NOT EXISTS mytasks (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    description VARCHAR(250) NOT NULL,
                    status VARCHAR(10),
                    createdAt TIMESTAMP NOT NULL,
                    updatedAt TIMESTAMP
                )
                """;
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableQuery);
            System.out.println("Таблица mytasks создана или уже существует.");
        }
    }
}
