package lesson09.menu;

import lesson09.util.ArrayUtil;
import lesson09.util.InputUtil;

import java.util.Scanner;

public class RandomCreateArrayMenu {
    static void showMenu(Scanner scanner) {
        int size = ArrayUtil.getArraySize(scanner);
        int value = InputUtil.getInt(scanner, "Max value");
        int[] array = ArrayUtil.createRandomFilledArray(size, value);
        ArrayUtil.printArray(array);
    }
}
