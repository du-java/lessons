package lesson11;

import lesson11.car.Engine;

public class App04 {
    public static void main(String[] args) {

        Ship.size = 13;

        Ship ship1 = new Ship();
        ship1.setEngine(new Engine());
        Ship ship2 = new Ship();
        ship1.setEngine(new Engine());

        ship1.prn();
        ship2.prn();

        Ship.getSize(ship1);

    }
}
