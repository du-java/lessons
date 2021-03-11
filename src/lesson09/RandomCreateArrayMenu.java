package lesson09;

import java.util.Arrays;
import java.util.Scanner;

public class RandomCreateArrayMenu {
    static void showMenu(Scanner scanner) {
        int size = ArrayUtil.getInt(scanner, "size");
        int value = ArrayUtil.getInt(scanner, "Max value");
        int[] array = ArrayUtil.createRandomFilledArray(size, value);
        ArrayUtil.printArray(array);


    }
}
