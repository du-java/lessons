package lesson08;

import java.util.Arrays;
import java.util.Scanner;

public class App04 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = getInt("Input size: ", 10, 20);
        int[] array = new int[size];
        array = fill(array);
        System.out.println(Arrays.toString(array));
    }

    private static int getInt(String msg, int min, int max) {
        int value;
        do {
            System.out.println(msg);
            value = scanner.nextInt();
        } while (value < min || value > max);
        return value;
    }

    static int[] fill(int[] arr) {
        int max = getInt("Input max number: ", 1, Integer.MAX_VALUE);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputValue(max, i);
        }
        return arr;
    }

    static int inputValue(int max, int ind) {
        String s = String.format("Input number for array [%d]: \n", ind);
        return getInt(s, 1, max);
    }
}
