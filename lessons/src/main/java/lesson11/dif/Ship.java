package lesson11.dif;

import lesson11.car.Engine;

public class Ship {

    private Engine engine;

    public static int size;

    public void prn() {
        System.out.println(size);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static int getSize(Ship ship) {
        System.out.println(ship.engine);
        return size;
    }

    public static void setSize(int size) {
        Ship.size = size;
    }
}
