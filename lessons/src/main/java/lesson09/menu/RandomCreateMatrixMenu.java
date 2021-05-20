package lesson09.menu;

import lesson09.util.InputUtil;
import lesson09.util.MatrixUtil;

import java.util.Scanner;

public class RandomCreateMatrixMenu {
    static void showMenu(Scanner scanner) {
        int row = InputUtil.getInt(scanner, "input Row");
        int column = InputUtil.getInt(scanner, "input Column");
        int max = InputUtil.getInt(scanner, "input max value");
        int[][] randomMatrix = MatrixUtil.createRandomMatrix(row, column, max);
        MatrixUtil.printMatrix(randomMatrix);
    }
}
