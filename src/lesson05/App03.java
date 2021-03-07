package lesson05;

import java.util.Arrays;
import java.util.Random;

public class App03 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = createArray(5);

        System.out.println(Arrays.toString(array));

        array = fillArray(array, 5);

        System.out.println(Arrays.toString(array));
    }

    static void printArray(int[] ints) {
        System.out.println(Arrays.toString(ints));
        fillArray(ints);
        System.out.println(Arrays.toString(ints));
        ints = new int[1];
    }

    static int[] createArray(int size) {
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = 1;
        }
        return ints;
    }

    static void fillArray(int[] ints, Random random) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt();
        }
    }

    static void fillArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = 1;
        }
    }

    static int[] fillArray(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
        }
        return new int[0];
    }

}
