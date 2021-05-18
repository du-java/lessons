package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App01 {

    private static final String FILE_BIN = "c:/vs/file.bin";

    public static void main(String[] args) {

        String test = "Hello World";

        try (FileOutputStream fos = new FileOutputStream(FILE_BIN)) {
            fos.write(test.getBytes());
            fos.flush();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(FILE_BIN)) {
            final StringBuilder stringBuilder = new StringBuilder();
            while (true) {
                int i = fis.read();
                if (i == -1) break;
                stringBuilder.append((char) i);
            }
            System.out.printf("text: %s", stringBuilder);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
