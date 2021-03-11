package lesson09.util;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {
    private static Random random = new Random();

    public static int getArraySize(Scanner scanner) {
        int size;
        do {
            size = InputUtil.getInt(scanner, "input size of array");
        } while (size < 0);
        return size;
    }

    private static int[] createArray(int size) {
        return new int[size];
    }

    private static int getElementOfArray(Scanner scanner, int max, int index) {
        int finish;
        while (true) {
            finish = InputUtil.getInt(scanner, "write number for " + index + " less than " + max);
            if (finish < max) break;
            System.out.println("More than max!");
        }
        return finish;
    }

    public static int[] createManualFilledArray(int sizeArray, int maxElement, Scanner scanner) {
        int[] array = createArray(sizeArray);
        for (int i = 0; i < sizeArray; i++) {
            array[i] = getElementOfArray(scanner, maxElement, i);
        }
        return array;
    }

    public static int[] createRandomFilledArray(int size, int max) {
        int[] array = createArray(size);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
