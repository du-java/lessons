package lesson28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum DbConnectionEnum {

    INSTANCE;

    private Connection connection;

    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=pass");
            } catch (SQLException exception) {
                throw new IllegalStateException();
            }
        }
        return connection;
    }
}
