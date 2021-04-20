package lesson20;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App05 {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("csv", "csv2", "str.txt");
        if (Files.exists(path)) {
            InputStream inputStream = Files.newInputStream(path);
            OutputStream outputStream = Files.newOutputStream(Paths.get("str.txt"));
            write(inputStream, outputStream);
            Path csv = Paths.get("csv");
            deleteDir(csv.toFile());
        }

        final Path path1 = Paths.get("files", "csv", "cars");
        final Path path2 = Paths.get("files", "csv", "toys");
        final Path path3 = Paths.get("files", "bin", "toys");
        final Path path4 = Paths.get("files", "bin", "cars");

        Files.createDirectories(path1);
        Files.createDirectories(path2);
        Files.createDirectories(path3);
        Files.createDirectories(path4);

        final File file = Paths.get("files").toFile();
        scan(file);
        deleteDir(file);
    }

    private static void write(InputStream in, OutputStream out) throws IOException {
        int tmp;
        while ((tmp = in.read()) != -1) {
            out.write(tmp);
        }
        out.flush();
    }

    private static void deleteDir(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File f : listFiles) {
                deleteDir(f);
            }
        }
        file.delete();
    }

    private static void scan(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File f : listFiles) {
                scan(f);
            }
        }
        System.out.println(file);
    }
}
