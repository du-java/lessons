package lesson28;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class App04 {
    public static void main(String[] args) throws SQLException {
        final Connection connection = DbConnectionEnum.INSTANCE.getConnection();
        createTable(connection);
        final int id = addStudent(connection);
        System.out.println(id);

        final Student student1 = Student.builder().firstname("ivan1").lastname("ivanov1").birthday(LocalDate.of(1999, 11, 11)).build();
        final Student student2 = Student.builder().firstname("ivan2").lastname("ivanov2").birthday(LocalDate.of(1999, 11, 12)).build();
        final Student student3 = Student.builder().firstname("ivan3").lastname("ivanov3").birthday(LocalDate.of(1999, 11, 13)).build();
        final Student student4 = Student.builder().firstname("ivan4").lastname("ivanov4").birthday(LocalDate.of(1999, 11, 14)).build();

        final List<Student> students = Arrays.asList(student1, student2, student3, student4);

        addListStudent4(connection, students);
    }

    private static void addListStudent(Connection connection, List<Student> students) throws SQLException {
        for (Student student : students) {
            final Statement statement = connection.createStatement();
            statement.execute("insert into students (firstname, lastname, birthday) " +
                    "values('" + student.getFirstname() + "', '" + student.getLastname() + "'," +
                    " '" + student.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "')");
        }
    }

    private static void addListStudent2(Connection connection, List<Student> students) throws SQLException {
        final Statement statement = connection.createStatement();
        for (Student student : students) {
            statement.addBatch("insert into students (firstname, lastname, birthday) " +
                    "values('" + student.getFirstname() + "', '" + student.getLastname() + "'," +
                    " '" + student.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "')");
        }
        statement.executeBatch();
    }

    private static void addListStudent3(Connection connection, List<Student> students) throws SQLException {
        for (Student student : students) {
            final PreparedStatement statement = connection.prepareStatement(
                    "insert into students (firstname, lastname, birthday) values(?,?,?)");
            statement.setString(1, student.getFirstname());
            statement.setString(2, student.getLastname());
            statement.setDate(3, Date.valueOf(student.getBirthday()));
            statement.executeUpdate();
        }
    }

    private static void addListStudent4(Connection connection, List<Student> students) throws SQLException {
        final PreparedStatement statement = connection.prepareStatement(
                "insert into students (firstname, lastname, birthday) values(?,?,?)");
        for (Student student : students) {
            statement.setString(1, student.getFirstname());
            statement.setString(2, student.getLastname());
            statement.setDate(3, Date.valueOf(student.getBirthday()));
            statement.addBatch();
        }
        statement.executeBatch();
    }

    private static int addStudent(Connection connection) throws SQLException {
        final Statement statement = connection.createStatement();
        statement.execute("insert into students (firstname, lastname, birthday) " +
                "values('ivan', 'ivanov', '2000-01-01')", Statement.RETURN_GENERATED_KEYS);
        final ResultSet generatedKeys = statement.getGeneratedKeys();
        generatedKeys.next();
        return generatedKeys.getInt(1);
    }

    private static void createTable(Connection connection) throws SQLException {
        final Statement statement = connection.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS students (\n" +
                "\tid BIGINT auto_increment NOT NULL,\n" +
                "\tfirstname varchar(20) NOT NULL,\n" +
                "\tlastname varchar(20) NOT NULL,\n" +
                "\tbirthday DATE NOT NULL,\n" +
                "\tCONSTRAINT students_pk PRIMARY KEY (id)\n" +
                ")");
    }

}
