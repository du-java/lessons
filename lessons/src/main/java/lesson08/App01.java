package lesson08;

import java.util.Scanner;

public class App01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter digit: ");
        int i1 = scanner.nextInt();
        System.out.print("Enter digit: ");
        int i2 = scanner.nextInt();
        System.out.printf("digit1 %d, digit2 %d\n", i1, i2);

        System.out.print("Enter your firstname: ");
        String firstname = scanner.nextLine();
        System.out.print("Enter your lastname: ");
        String lastname = scanner.nextLine();

        System.out.printf("%s, %s", lastname, firstname);

    }


}
