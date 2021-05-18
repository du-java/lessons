package lesson18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App03 {
    private static final String FILE = "buffered.txt";

    public static void main(String[] args) {

        try (final BufferedWriter wrt = new BufferedWriter(new FileWriter(FILE))) {
            wrt.write("TEST STRING 1");
            wrt.newLine();
            wrt.flush();
            wrt.write("TEST STRING 2");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        try (final BufferedReader rdr = new BufferedReader(new FileReader(FILE))) {
            final List<String> list = new ArrayList<>();
            String line;
            while ((line = rdr.readLine()) != null) {
                list.add(line);
            }
            System.out.println(String.join("\n", list));
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
