package lesson19;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

public class App04 {

    private static final String BINARY_FILENAME = "data.bin";
    private static final String CSV_FILENAME = "data.csv";

    public static void main(String[] args) throws IOException {
        List<Student> list = Arrays.asList(
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Sasha", "Ivanov", LocalDate.of(2000, 1, 1), "g1", 1.58, 175),
                new Student("Masha", "Ivanova", LocalDate.of(2001, 11, 11), "g1", 5.8, 155));
        write(list);
        System.out.println(read());
        tcv(list);
        System.out.println(readCSV());
    }

    private static void write(List<Student> list) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(BINARY_FILENAME));) {
            dataOutputStream.writeInt(list.size());
            for (Student student : list) {
                dataOutputStream.writeUTF(student.getFirstname());
                dataOutputStream.writeUTF(student.getLastname());
                dataOutputStream.writeLong(student.getBirthday().toEpochDay());
                dataOutputStream.writeUTF(student.getGroup());
                dataOutputStream.writeDouble(student.getWeight());
                dataOutputStream.writeLong(student.getHeight());
            }
        }
    }

    private static List<Student> read() {
        List<Student> students = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(BINARY_FILENAME))) {
            final int size = dis.readInt();
            for (int i = 0; i < size; i++) {
                students.add(new Student(dis.readUTF(), dis.readUTF(), LocalDate.ofEpochDay(dis.readLong()),
                        dis.readUTF(), dis.readDouble(), dis.readLong()));
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return students;
    }

    private static void tcv(List<Student> students) {
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(CSV_FILENAME))) {
            bf.write("headers");
            bf.newLine();
            for (Student student : students) {
                bf.write(student.csv());
                bf.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static List<Student> readCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILENAME))) {
            reader.readLine(); // skip headers
            String line;
            ArrayList<Student> students = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                students.add(parseStudent(line));
            }
            return students;
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
            throw new IllegalStateException();
        } catch (DateTimeParseException | IOException ex) {
            System.err.println(ex.getMessage());
            return Collections.emptyList();
        }
    }

    private static Student parseStudent(String line) {
        String[] split = line.split(",");
        Student student = new Student();
        student.setFirstname(split[0]);
        student.setLastname(split[1]);
        student.setBirthday(LocalDate.parse(split[2]));
        student.setGroup(split[3]);
        student.setWeight(Double.parseDouble(split[4]));
        student.setHeight(Long.parseLong(split[5]));
        return student;
    }
}

