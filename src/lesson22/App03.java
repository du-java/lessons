package lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App03 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(140, "car1"));
        cars.add(new Car(150, "car2"));
        cars.add(new Car(160, "car3"));
        cars.add(new Car(170, "car4"));
        cars.add(new Car(130, "car5"));

        final List<String> collect = cars.stream()
                .filter(car -> car.getPower() > 150)
                .map(car -> {
                    final Car tmp = new Car();
                    tmp.setName(car.getName() + " power");
                    tmp.setPower(car.getPower());
                    return tmp;
                })
                .peek(System.out::println)
                .map(Car::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
