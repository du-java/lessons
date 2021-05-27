package lesson28;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class App02 {
    public static void main(String[] args) throws SQLException {
        DbConnection.getConnection();
        final Connection connection = DbConnection.getConnection();
        select1Plus1(connection);

    }

    private static void select1Plus1(Connection connection) throws SQLException {
        final Statement statement = connection.createStatement();
        statement.executeQuery("select 1+1");
    }
}
