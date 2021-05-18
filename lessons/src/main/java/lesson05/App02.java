package lesson05;

import java.util.Arrays;
import java.util.Random;

public class App02 {
    public static void main(String[] args) {

        Random random = new Random();
        Random random1 = random;
        random1 = null;
        random1 = random;

        int[] ints = new int[10];

        int[] intsCopy = ints;
        intsCopy = new int[1];

        int[] ints2 = new int[10];

        fillArray(ints, random);
        fillArray(ints2, random);

        printArray(ints);
        printArray(ints2);
        printArray(ints);

        System.out.println(Arrays.toString(ints));
    }

    static void printArray(int[] array) {
        array = new int[1];
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        fillArray(array);

        System.out.println(Arrays.toString(array));

    }

    static void fillArray(int[] ints, Random rnd) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = rnd.nextInt();
        }
    }

    static void fillArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = 1;
        }
    }

}
