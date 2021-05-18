package lesson06;

import java.util.Random;

public class FillArrays {

    private static Random random = new Random();

    static int[] fill(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        return ints;
    }
}
