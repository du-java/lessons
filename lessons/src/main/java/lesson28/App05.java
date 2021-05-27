package lesson28;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.time.LocalDate;

@Slf4j
public class App05 {
    public static void main(String[] args) throws SQLException {
        final Connection connection = DbConnectionEnum.INSTANCE.getConnection();

        deleteStudentById(connection, 3);

        deleteStudentByDate(connection, LocalDate.of(1999, 12, 31), LocalDate.of(2000, 1, 2));

        updateFirstnameStudentById(connection, Student.builder().firstname("Ivan").build(), "ivan1");
    }

    private static void deleteStudentById(Connection connection, int id) throws SQLException {
        final PreparedStatement preparedStatement = connection.prepareStatement(
                "delete from test.students where id = ?"
        );
        preparedStatement.setInt(1, id);
        final int count = preparedStatement.executeUpdate();
        log.info("deleted {} records", count);
    }

    private static void deleteStudentByDate(Connection connection, LocalDate from, LocalDate to) throws SQLException {
        final PreparedStatement preparedStatement = connection.prepareStatement(
                "delete from test.students where birthday between ? and ?"
        );
        preparedStatement.setDate(1, Date.valueOf(from));
        preparedStatement.setDate(2, Date.valueOf(to));
        final int count = preparedStatement.executeUpdate();
        log.info("deleted {} records", count);
    }

    private static void updateFirstnameStudentById(Connection connection, Student student, String oldFirstname) throws SQLException {
        final PreparedStatement preparedStatement = connection.prepareStatement(
                "update test.students set firstname = ? where firstname = ?"
        );
        preparedStatement.setString(1, student.getFirstname());
        preparedStatement.setString(2, oldFirstname);
        final int count = preparedStatement.executeUpdate();
        log.info("deleted {} records", count);
    }
}
