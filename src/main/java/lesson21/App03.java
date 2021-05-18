package lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App03 {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(new Car(), new SportCar(), new Truck());
        print(cars);

        List<SportCar> sportCars = Arrays.asList(new SportCar(), new SportCar(), new SportCar());
        print(sportCars);

        addCars(cars);
//        addCars(sportCar);

        System.out.println();
        final SportCar sportCar = new SportCar();
        System.out.println(sportCar.getString());
        System.out.println(sportCar.get());
        System.out.println(sportCar.CONST);
//        Transport.CONST;

        List<List<Transport>> listList = new ArrayList<>();
        printList(listList);
        List<List<Car>> caLists = new ArrayList<>();
        printList(caLists);
        List<List<Truck>> caLists1 = new ArrayList<>();
        printList(caLists1);
    }

    private static void addCars(List<? super Car> list) {
        list.add(new Truck());
        list.add(new SportCar());
        list.add(new Car());
//        list.add(new Vehicle())
    }

    private static void print(List<? extends Car> cars) {
        for (Car car : cars) {
            System.out.println(car.get());
        }
//        cars.add(new Car())
//        cars.add(new SportCar())
    }

    private static void printList(List<? extends List<? extends Transport>> carLists) {
    }
}
