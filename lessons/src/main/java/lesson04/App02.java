package lesson04;

import java.util.Arrays;
import java.util.Random;

public class App02 {
    public static void main(String[] args) {


        Random random = new Random();
//        int i = 14;
//        while (i > 5) {
//            System.out.println(i);
//            if (i % 5 == 0) break;
//            if (i % 2 == 0) {
//                i -= 2;
//            } else {
//                i -= 3;
//            }
//        }

        int[] array = new int[10];

        for (int j = 0; j < array.length; j++) {
            array[j] = j;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ",");
        }
        System.out.println();

        for (int el : array) {
            System.out.print(el + ",");
        }

        System.out.println();
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println();
        System.out.println(Arrays.toString(array));

        array[4] = 999;
        System.out.println(Arrays.toString(array));

        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt();
            }
        }

        for (int[] arr : matrix) {
            for (int el : arr) {
                System.out.print(el + ",");
            }
            System.out.println();
        }

        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }


    }
}
