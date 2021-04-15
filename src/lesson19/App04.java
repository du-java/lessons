package lesson19;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App04 {
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
        tcv(list);
//        System.out.println(read());
    }

    private static void write(List<Student> list) throws IOException {
        try (
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.bin"));) {
            dataOutputStream.writeInt(list.size());
            for (int i = 0; i < list.size(); i++) {
                dataOutputStream.writeUTF(list.get(i).getFirstname());
                dataOutputStream.writeUTF(list.get(i).getLastname());
                dataOutputStream.writeLong(list.get(i).getBirthday().toEpochDay());
                dataOutputStream.writeUTF(list.get(i).getGroup());
                dataOutputStream.writeDouble(list.get(i).getWeight());
                dataOutputStream.writeLong(list.get(i).getHeight());
            }
        }

    }

    private static List<Student> read() {
        List<Student> students = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            final int size = dis.readInt();
            for (int i = 0; i < size; i++) {
                students.add(new Student(dis.readUTF(), dis.readUTF(), LocalDate.ofEpochDay(dis.readLong()), dis.readUTF(), dis.readDouble(), dis.readLong()));
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return students;
    }

    private static void tcv(List<Student> students){
        try (BufferedWriter bf = new BufferedWriter(new FileWriter("data.csv"))) {
            bf.write("pole1");
            bf.newLine();
            for (Student student: students) {
                bf.write(student.csv());
                bf.newLine();
            }

    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

