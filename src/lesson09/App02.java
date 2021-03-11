package lesson09;

import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {

        try {
            int a = 1;
            a /= 0;
        } catch (ArithmeticException ex) {
            System.err.println(ex.getMessage());
        }

        int[] array = new int[0];

        try {
            int a = array[1];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("ArrayIndexOutOfBoundsException");
        }

        try {
            Scanner scanner = new Scanner(System.in);
            int i1 = Integer.parseInt(scanner.nextLine());
            int i2 = i1 / 0;
        } catch (NumberFormatException ex) {
            System.err.println("input not a number" + ex.getMessage());
        } catch (ArithmeticException ex) {
            System.err.println("divisen by zero" + ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
