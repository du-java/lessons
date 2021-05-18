package lesson09.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {
    public static int getInt(Scanner scanner, String msg) {
        while (true) {
            try {
                System.out.println(msg);
                return scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("input not a number");
                scanner.nextLine();
            }
        }
    }
}
