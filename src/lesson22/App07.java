package lesson22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class App07 {
    public static void main(String[] args) throws IOException {

        try (final BufferedReader reader = new BufferedReader(new FileReader("cars.csv"))) {
            final List<Car> carList = reader.lines()
                    .map(App07::parse)
                    .collect(Collectors.toList());
        }
    }

    static Car parse(String line) {
        final String[] split = line.split(",");
        return new Car(Integer.parseInt(split[0]), split[1]);
    }
}
