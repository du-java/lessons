package lesson04;

import java.util.Arrays;
import java.util.Random;

public class App01 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] src = new int[10];
        int[] dst = new int[10];

        for (int i = 0; i < src.length; i++) {
            src[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(src));

        for (int i = 0; i < dst.length; i++) {
            int j = src[i];
            dst[i] = src[j]; // src[src[i]]
        }

        System.out.println(Arrays.toString(dst));

    }
}
