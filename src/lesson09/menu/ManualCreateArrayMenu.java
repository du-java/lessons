package lesson09.menu;

import lesson09.util.ArrayUtil;
import lesson09.util.InputUtil;

import java.util.Scanner;

public class ManualCreateArrayMenu {
    static void showMenu(Scanner scanner) {
        int size = InputUtil.getInt(scanner, "size");
        int value = InputUtil.getInt(scanner, "Max value");
        int[] array = ArrayUtil.createManualFilledArray(size, value, scanner);
        ArrayUtil.printArray(array);
    }
}
