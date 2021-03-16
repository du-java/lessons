package lesson09;

import lesson09.menu.MainMenu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainMenu.showMenu(scanner);
    }
}