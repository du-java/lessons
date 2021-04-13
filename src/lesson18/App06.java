package lesson18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class App06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String line = scanner.nextLine();
        try (FileOutputStream fos = new FileOutputStream("file.txt")) {
            fos.write(line.getBytes());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
