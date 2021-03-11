package lesson09;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {
    static Random random = new Random();

    static int getInt(Scanner scanner, String msg) {
        System.out.println(msg);
        return scanner.nextInt();
    }

    static int[] createArray(int size) {
        return new int[size];
    }

    static int getElementOfArray(Scanner scanner, int max, int index) {
        int finish;
        while (true) {
            finish = getInt(scanner, "write number for " + index + " less than " + max);
            if (finish < max) break;
            System.out.println("More than max!");
        }
        return finish;
    }

    static int[] createManualFilledArray(int sizeArray, int maxElement, Scanner scanner) {
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
}
