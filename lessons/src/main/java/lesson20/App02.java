package lesson20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App02 {
    public static void main(String[] args) throws IOException {

        final List<String> stringList = Files.readAllLines(Paths.get("cars.csv"));

        System.out.println(stringList);

        final Path cars = Files.write(
                Paths.get(
                        Files.createDirectories(
                                Paths.get("files/csv", "cars")
                        )
                                .toString(), "cars.csv"
                ),
                stringList);

        System.out.println(cars.getParent());

        System.out.println(cars.toRealPath());

        final Path cars1 = Paths.get("files", "csv", "cars");
        System.out.println(cars1.toRealPath());
        System.out.println(cars1.isAbsolute());
        System.out.println(cars1.toAbsolutePath());
    }
}
