package lesson28;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
public class App06 {
    public static void main(String[] args) throws SQLException {
        final Connection connection = DbConnectionEnum.INSTANCE.getConnection();

        int id = 5;
        final Student student = getStudentById(connection, id).orElseThrow(IllegalStateException::new);

        log.info("student[{}]: {}", id, student);
        final List<Student> studentsByBirthday = getStudentsByBirthday(connection, LocalDate.of(1999, 1, 31), LocalDate.of(2001, 1, 2));
        log.info("students: {}", studentsByBirthday);


        getStudentById(connection, 3).orElseThrow(IllegalStateException::new);
    }

    private static List<Student> getStudentsByBirthday(Connection connection, LocalDate from, LocalDate to) throws SQLException {
        final PreparedStatement statement = connection.prepareStatement(
                "select * from test.students where birthday between ? and ?"
        );
        statement.setDate(1, Date.valueOf(from));
        statement.setDate(2, Date.valueOf(to));
        final ArrayList<Student> students = new ArrayList<>();
        final ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            students.add(Student.builder()
                    .id(rs.getInt("id"))
                    .firstname(rs.getString("firstname"))
                    .lastname(rs.getString("lastname"))
                    .birthday(rs.getDate("birthday").toLocalDate())
                    .build());
        }
        return students;
    }

    private static Optional<Student> getStudentById(Connection connection, int id) throws SQLException {
        final PreparedStatement statement = connection.prepareStatement("select id,firstname,lastname,birthday from test.students where id = ?");
        statement.setInt(1, id);
        final ResultSet rs = statement.executeQuery();
        if (rs.next()) {
            return Optional.of(Student.builder()
                    .id(rs.getInt("id"))
                    .firstname(rs.getString("firstname"))
                    .lastname(rs.getString("lastname"))
                    .birthday(rs.getDate("birthday").toLocalDate())
                    .build());
        }
        return Optional.empty();
    }


}
