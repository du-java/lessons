package lesson18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App09 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("array.txt"))) {

            String array = null;
            int count = 0;
            int length = 0;
            while ((array = bufferedReader.readLine()) != null) {
                count++;
                if (length == 0) {
                    length = array.length();
                }
            }
            System.out.printf("Strings %s, Symbols %s ", count, length);

        } catch (IOException e){

        }

    }
}
