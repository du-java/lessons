package lesson22;

import java.util.ArrayList;
import java.util.List;

public class App04 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(140, "car1"));
        cars.add(new Car(150, "car2"));
        cars.add(new Car(160, "car3"));
        cars.add(new Car(170, "car4"));
        cars.add(new Car(130, "car5"));
        cars.stream()
                .peek(System.out::println)
                .filter(car -> !car.getName().contains("3"))
                .peek(car -> car.setPower(car.getPower()+100))
                .map(App04::upperCase)
                .forEach(System.out::println);

    }
static Car upperCase(Car car){
    char firstLetter = car.getName().toUpperCase().charAt(0);
    String restName = car.getName().substring(1);
    String newName = firstLetter + restName;
    car.setName(newName);
    return car;
}
}
