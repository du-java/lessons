package lesson04;

import java.util.Arrays;
import java.util.Random;

public class App04 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(ints));
//        Arrays.sort(ints);

        int counter = 0;

        for (int i = 0; i < ints.length; i++) {
            int x = ints[i];
            for (int j = i; j < ints.length; j++, counter++) {
                int y = ints[j];
                if(ints[i] < ints[j]) {
                    int tmp = ints[j];
                    ints[j] = ints[i];
                    ints[i] = tmp;
                }
            }
        }
        System.out.println(counter);
        System.out.println(Arrays.toString(ints));

    }
}
