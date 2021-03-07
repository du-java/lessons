package lesson04;

import java.util.Arrays;
import java.util.Random;

public class App05 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89)+10;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 99;
                }
            }
        }

        for (int[] array : matrix) {
            System.out.println(Arrays.toString(array));
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == (matrix[i].length - j - 1)) {
                    matrix[i][j] = 99;
                }
            }
        }

        for (int[] array : matrix) {
            System.out.println(Arrays.toString(array).replaceAll("99","  "));
        }
    }
}
