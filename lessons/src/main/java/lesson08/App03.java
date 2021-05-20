package lesson08;

import java.io.Console;

public class App03 {
    public static void main(String[] args) {
        Console console = System.console();

        String name = console.readLine("Enter your name:");
        char[] secret = console.readPassword("Enter your secret:");

        System.out.printf("Name: %s, secret: %s", name, String.valueOf(secret));
    }
}
