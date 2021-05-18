package lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App05 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(140, "car1"));
        cars.add(new Car(150, "car2"));
        cars.add(new Car(160, "car3"));
        cars.add(new Car(170, "car4"));
        cars.add(new Car(130, "car5"));
        boolean car1 = cars.stream()
                .allMatch(car -> car.getName().contains("car"));
        Optional<Car> car2 = cars.stream()
                .filter(car -> !car.getName().startsWith("car"))
                .findAny();
        if (car2.isPresent()) {
            Car car = car2.get();
        }
        Car car = car2.orElse(new Car());
        car2.ifPresent(System.out::println);
    }
}
