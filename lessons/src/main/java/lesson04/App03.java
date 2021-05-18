package lesson04;

import java.util.Arrays;
import java.util.Random;

public class App03 {
    public static void main(String[] args) {

        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }

        for (int i = 0; i < ints.length / 2; i++) {
            int tmp = ints[i];
            ints[i] = ints[ints.length - i - 1];
            ints[ints.length - i - 1] = tmp;
        }

        System.out.println(Arrays.toString(ints));
    }
}
