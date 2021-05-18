package lesson19;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App02 {

    public static void main(String[] args) throws IOException {
        writeCars(Arrays.asList(new Car(123, "bmw", 5), new Car(345, "audi", 3)));
        final List<Car> cars = readCars();
        System.out.println(cars);
    }

    private static void writeCars(List<Car> list) throws IOException {
        final DataOutputStream dos = new DataOutputStream(new FileOutputStream("cars.bin"));
        dos.writeInt(list.size());
        for (Car car : list) {
            dos.writeInt(car.getPower());
            dos.writeUTF(car.getName());
            dos.writeInt(car.getDoors());
        }
    }

    private static List<Car> readCars() throws IOException {
        final DataInputStream dis = new DataInputStream(new FileInputStream("cars.bin"));
        final int size = dis.readInt();
        final List<Car> cars = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            cars.add(new Car(dis.readInt(), dis.readUTF(), dis.readInt()));
        }
        return cars;
    }
}
