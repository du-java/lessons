package lesson20;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App04 {
    public static void main(String[] args) throws IOException {
        File file = new File("csv/str.txt");
        if (file.exists() && file.isFile()) {
            Path dir = Paths.get("csv", "csv2");
            if (Files.notExists(dir)) {
                Files.createDirectory(dir);
            }

            Path pathToFile = Paths.get(dir.toString(), file.getName());
            Files.deleteIfExists(pathToFile);
            file.renameTo(pathToFile.toFile());
            System.out.println(file.toPath().toString());

        } else {
            if (file.isDirectory()) file.deleteOnExit();
            Path directories = Files.createDirectories(Paths.get("csv", "csv2"));
            Files.createFile(Paths.get(directories.toString(), file.getName()));
        }

    }
}
