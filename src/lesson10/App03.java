package lesson10;

import lesson10.abstracts.Movable;

public class App03 {
    public static void main(String[] args) {

        Object[] objects = new Object[2];

        objects[0] = new Bus();
        objects[1] = new Car(1, 1, "");

        for (Object o : objects) {
//            if(o.getClass() == Car.class || o.getClass() == Bus.class)
            if (o instanceof Movable) {
                ((Movable) o).move();
                if (Car.class == o.getClass()) {
                    ((Car) o).carWheels();
                }
            }
        }

    }
}
