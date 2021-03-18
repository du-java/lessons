package lesson11;

import lesson11.car.Engine;
import lesson11.car.Gear;
import lesson11.car.Hood;

public class App03 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.switchOn();
        car.drive();

        Car2.Builder builder = new Car2.Builder();
        Car2 empty = builder.build();

        Car2 onlyEngine = builder.engine(new Engine()).build();
        Car2 onlyGear = builder.gear(new Gear()).build();

        Car2 car2 = builder
                .engine(new Engine())
                .hood(new Hood())
                .gear(new Gear())
                .build();

        Car.Gear gear = new Car().new Gear();

        final double pi = 3.14;
//        pi = 1;

    }
}
