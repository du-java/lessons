package lesson18;

import java.io.*;

public class App02 {
    private static final String FILE_BIN = "c:/vs/writer.txt";

    public static void main(String[] args) {

        try (final Writer wrt = new FileWriter(FILE_BIN)) {
            wrt.write("Hello World. String");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        try (final Reader rdr = new FileReader(FILE_BIN)) {
            final StringBuilder stringBuilder = new StringBuilder();
            while (true) {
                int i = rdr.read();
                if (i == -1) break;
                stringBuilder.append((char) i);
            }
            System.out.println(stringBuilder);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
