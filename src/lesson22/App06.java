package lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App06 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(140, "car1"));
        cars.add(new Car(150, "car2"));
        cars.add(new Car(160, "car3"));
        cars.add(new Car(170, "car4"));
        cars.add(new Car(130, "car5"));


        Optional<Car> max = cars.stream()
                .filter(car -> car.getPower() < 150)
                .max((car1, car2) -> car1.getPower() - car2.getPower());
        Car car = max.orElseThrow(() -> new IllegalStateException());
    }
}
