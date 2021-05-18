package lesson22;

import java.util.*;

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
                .max(Comparator.comparingInt(Car::getPower));
        Car carMax = max.orElseThrow(IllegalStateException::new);

        final Car car = getCar(cars);

        System.out.println(carMax);
        System.out.println(car);
    }

    private static Car getCar(List<Car> cars) {
        final ArrayList<Car> cars1 = new ArrayList<>();

        for (Car car : cars) {
            if (car.getPower() < 150) cars1.add(car);
        }

        if (cars1.isEmpty()) new IllegalStateException();
        cars1.sort((car1, car2) -> car2.getPower() - car1.getPower());

        final Car car = cars1.get(0);
        return car;
    }
}
