package lesson10.transport;

import lesson10.transport.Car;

public class App01 {
    public static void main(String[] args) {

        Car car = new Car(4, 85, "car");
        Car car1 = new Car(4, 85, "car");

        int doorCount = car.getDoorCount();
        String name = car.getName();
        int power = car.getPower();

        System.out.println(car == car1);

        System.out.println(car.equals(car1));
        car.setDoorCount(3);
        System.out.println(car.equals(car1));

        System.out.println(car);
        System.out.println(car1);

        System.out.println(car.hashCode());

    }
}
