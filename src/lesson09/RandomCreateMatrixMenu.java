package lesson09;

import java.util.Scanner;

public class RandomCreateMatrixMenu {
    static void showMenu(Scanner scanner){
        int row = ArrayUtil.getInt(scanner, "input Row");
        int column = ArrayUtil.getInt(scanner, "input Column");
        int max = ArrayUtil.getInt(scanner, "input max value");
        int[][] randomMatrix = MatrixUtil.createRandomMatrix(row, column, max);
        MatrixUtil.printMatrix(randomMatrix);
    }
}
