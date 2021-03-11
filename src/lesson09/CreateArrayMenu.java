package lesson09;

import java.util.Scanner;

public class CreateArrayMenu {

    static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("Create ArrayMenu");
            System.out.println("1 - Manual filing array");
            System.out.println("2 - Random");
            System.out.println("0 - Exit");
            System.out.print("Choose: ");
            System.out.println();
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    ManualCreateArrayMenu.showMenu(scanner);
                    break;
                case 2:
                    RandomCreateArrayMenu.showMenu(scanner);
                    break;
                case 0:
                    return;
            }
        }
    }

}
