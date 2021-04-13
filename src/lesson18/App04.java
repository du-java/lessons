package lesson18;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App04 {
    private static final String FILE = "buffered.txt";

    public static void main(String[] args) {

        final List<String> strings = Arrays.asList("STRING1", "STRING2");
        try (final BufferedWriter wrt = new BufferedWriter(new FileWriter(FILE))) {
            for (String str : strings) {
                wrt.write(str);
                wrt.newLine();
            }
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
