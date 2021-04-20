package lesson20;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App05 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Files.newInputStream(Paths.get("csv", "csv2", "str.txt"));
        OutputStream outputStream = Files.newOutputStream(Paths.get("str.txt"));
        write(inputStream,outputStream);
        Path csv = Paths.get("csv");
        csv.toFile().delete();
    }

    private static void write(InputStream in, OutputStream out) throws IOException {
        int tmp;
        while ((tmp = in.read()) != -1) {
            out.write(tmp);
        }
        out.flush();
    }
}
