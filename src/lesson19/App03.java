package lesson19;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App03 {
    public static void main(String[] args) throws IOException {
        // CSV
        final List<Car> cars = Arrays.asList(new Car(123, "bmw", 5), new Car(345, "audi", 3));

//        write(cars);
        System.out.println(read());
    }

    private static void write(List<Car> list) throws IOException {
        try (final BufferedWriter writer = new BufferedWriter(new FileWriter("cars.csv"))) {
            writer.write("power,name,doors");
            writer.newLine();
            for (Car car : list) {
                writer.write(car.getPower() + "," + car.getName() + "," + car.getDoors());
                writer.newLine();
            }
        }
    }

    private static List<Car> read() throws IOException {
        final List<Car> cars = new ArrayList<>();
        try (final BufferedReader reader = new BufferedReader(new FileReader("cars.csv"))) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                final String[] split = line.split(",");
                cars.add(new Car(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2])));
            }
        }
        return cars;
    }
}