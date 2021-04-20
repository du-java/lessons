package lesson20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App03 {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <10; i++) {
          strings.add(String.valueOf(random.nextInt()));
        }
        Path csv = Files.createDirectories(Paths.get("csv"));
        Path file = Paths.get(csv.toString(), "str.txt");
        System.out.println(Files.exists(file));
        Files.write(file,strings);
    }
}
