package lesson09.menu;

import java.util.Scanner;

public class MainMenu {

    public static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1 - Create Array");
            System.out.println("2 - Create Matrix");
            System.out.println("0 - Exit");
            System.out.print("Choose: ");
            System.out.println();
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    CreateArrayMenu.showMenu(scanner);
                    break;
                case 2:
                    CreateMatrixMenu.showMenu(scanner);
                    break;
                case 0:
                    return;
            }
        }
    }
}
