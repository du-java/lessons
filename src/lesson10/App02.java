package lesson10;

import lesson10.abstracts.Movable;
import lesson10.abstracts.Transport;

public class App02 {
    public static void main(String[] args) {

        Movable bus = new Bus();
        Movable car = new Car(1, 2, "", 4);

        Movable[] movables = new Movable[2];
        movables[0] = bus;
        movables[1] = car;

        for (Movable o : movables) {
            System.out.println(o.toString());
            o.move();
            if (o.getClass() == Car.class) {
                ((Car) o).moveFaster();
            }
            if (o instanceof Transport) {
                System.out.println("Transport");
            }
        }

        Bus bus1 = (Bus) bus;
        bus1.move();


    }
}
