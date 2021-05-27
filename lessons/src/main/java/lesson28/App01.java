package lesson28;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;

@Slf4j
public class App01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (final Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306",
                "root",
                "pass")) {
            try (final Statement statement = connection.createStatement()) {
                try (final ResultSet resultSet = statement.executeQuery("select 1+1 as sum")) {
                    if (resultSet.next()) {
                        final int sum1 = resultSet.getInt(1);
                        final int sum2 = resultSet.getInt("sum");
                        log.info("sum1: {} sum2: {}", sum1, sum2);
                    }
                }
            }
        }
    }
}
