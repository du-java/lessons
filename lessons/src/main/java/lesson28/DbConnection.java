package lesson28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbConnection {

    private static Connection connection /* = createConnection()*/;

    public static Connection getConnection() {
        if (connection == null) {
            connection = createConnection();
        }
        return connection;
    }

    private static Connection createConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306",
                    "root",
                    "pass"
            );
        } catch (SQLException exception) {
            throw new IllegalStateException();
        }
    }

    private DbConnection() {
    }
}
