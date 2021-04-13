package lesson18;

import java.awt.image.ImagingOpException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of strings");
        int i = scanner.nextInt();
        System.out.println("Enter count os symbols");
        int j = scanner.nextInt();
        List<String> strings = new ArrayList<>(i);
        for (int k = 0; k < i; k++) {
            strings.add(buildString(j));
        }

      try(  BufferedWriter bfw = new BufferedWriter(new FileWriter("array.txt"))) {
          for (String string : strings) {

              bfw.write(string);
              bfw.newLine();
          }
        }catch (IOException ex){
          System.err.println("error");
      }
    }

    private static String buildString(int j){
        StringBuilder element = new StringBuilder();
        Random random = new Random();

        for (int k = 0; k < j; k++) {

            element.append((char) random.nextInt(256));

        }
       return element.toString();
    }
}
