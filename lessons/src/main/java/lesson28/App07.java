package lesson28;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
public class App07 {
    public static void main(String[] args) throws SQLException {
        final Connection connection = DbConnectionEnum.INSTANCE.getConnection();

        final List<Student> studentsByBirthday = getStudentsByBirthday(connection, LocalDate.of(1999, 1, 31), LocalDate.of(2001, 1, 2));
        log.info("students: {}", studentsByBirthday);
    }

    private static List<Student> getStudentsByBirthday(Connection connection, LocalDate from, LocalDate to) throws SQLException {
        try (final PreparedStatement statement = connection.prepareStatement(
                "select * from test.students where birthday between ? and ?")) {
            statement.setDate(1, Date.valueOf(from));
            statement.setDate(2, Date.valueOf(to));
            final ArrayList<Student> students = new ArrayList<>();
            try (final ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    students.add(Student.builder()
                            .id(rs.getInt("id"))
                            .firstname(rs.getString("firstname"))
                            .lastname(rs.getString("lastname"))
                            .birthday(rs.getDate("birthday").toLocalDate())
                            .build());
                }
            }
            return students;
        }
    }
}
