package lesson19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) throws IOException {

        final Car bmw = new Car(1500000, "bmwsdagdsfgdfsg", 5);

        final DataOutputStream dos = new DataOutputStream(new FileOutputStream("bmw.bin"));
        dos.writeInt(bmw.getPower());
        dos.writeInt(bmw.getDoors());
        dos.writeUTF(bmw.getName());
        dos.flush();

        final FileWriter fos = new FileWriter("bmw.txt");
        fos.write(String.valueOf(bmw.getPower()));
        fos.write(String.valueOf(bmw.getDoors()));
        fos.write(bmw.getName());
        fos.flush();

        final DataInputStream dis = new DataInputStream(new FileInputStream("bmw.bin"));
        Car newCar;
        {
            final int power = dis.readInt();
            final int doors = dis.readInt();
            final String name = dis.readUTF();
            newCar = new Car(power, name, doors);
        }

        System.out.println(newCar);

//        final FileReader fr = new FileReader("bmw.txt");
//        Car newCar2;
//        {
//            final int power = fr.read();
//            final int doors = fr.read();
//            final String name = fr.read();
//            newCar2 = new Car(power, name, doors);
//        }



    }

}
