package lesson22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App08 {
    public static void main(String[] args) throws IOException {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(140, "car1"));
        cars.add(new Car(150, "car2"));
        cars.add(new Car(160, "car3"));
        cars.add(new Car(170, "car4"));
        cars.add(new Car(130, "car5"));

        final Predicate<Car> predicate = car -> (car.getPower() <= 160) && (car.getPower() >= 140);

        final List<Car> filtered1 = filter(cars, car -> (car.getPower() <= 160) && (car.getPower() >= 140));
        final List<Car> filtered2 = filter(cars, powerBetween140And160());
        final List<Car> filtered3 = filter(cars, predicate);

        final List<Car> filtered4 = filter(cars, carName());
        System.out.println(filtered4);
    }

    static List<Car> filter(List<Car> list, Predicate<Car> filter) {
        return list.stream().filter(filter).collect(Collectors.toList());
    }

    static Predicate<Car> powerBetween140And160() {
        return car -> (car.getPower() <= 160) && (car.getPower() >= 140);
    }

    static Predicate<Car> carName() {
        return car -> {
            final String substring = car.getName().substring(car.getName().length() - 1);
            final int i = Integer.parseInt(substring);
            return i <= 2;
        };
    }
}
