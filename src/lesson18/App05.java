package lesson18;

import java.io.*;
import java.util.Arrays;

public class App05 {
    public static void main(String[] args) {

        try (final FileOutputStream audiFos = new FileOutputStream("audi.bin");
             final ObjectOutputStream objectOutputStream = new ObjectOutputStream(audiFos)) {
            final Tyre sava = new Tyre("sava", 15);
            final lesson18.sub.Car audi = new lesson18.sub.Car(123, "audi", Arrays.asList(sava, sava, sava, sava));
            objectOutputStream.writeObject(audi);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        try (FileInputStream audiFis = new FileInputStream("audi.bin");
             ObjectInputStream ois = new ObjectInputStream(audiFis);) {
            Car audi = null;
            final Object o = ois.readObject();
            if (o instanceof Car) {
                audi = (Car) o;
            }
            System.out.println(audi);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
