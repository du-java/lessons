package lesson25;

import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.Arrays;

public class App03 {
    public static void main(String[] args) {
        final Tyre nokian1 = new Tyre(13, "Nokian");
        final Tyre nokian2 = new Tyre(14, "Nokian");
        final Tyre nokian3 = new Tyre(15, "Nokian");
        final Tyre nokian4 = new Tyre(16, "Nokian");
        final Car audi = new Car(new Engine(123, "98"), "audi", BigDecimal.TEN,
                Arrays.asList(nokian1, nokian2, nokian3, nokian4));

        final Gson gson = new Gson();
        final String json = gson.toJson(audi);
        System.out.println(json);

        final Car car = gson.fromJson(json, Car.class);
        final Engine engine = gson.fromJson(json, Engine.class);

        System.out.println(car);
        System.out.println(engine);
    }
}
