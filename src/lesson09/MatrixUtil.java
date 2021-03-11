package lesson09;

import java.util.Scanner;

public class MatrixUtil {
    static int[][] createMatrix(int row,int column){
        return new int[row][column];
    }
    static int[][] createManualMatrix(Scanner scanner ,int row ,int column, int max ){
       int[][] array= createMatrix(row,column);
       for(int i=0; i< array.length;i++){
        array[i]= ArrayUtil.createManualFilledArray(column,max,scanner);
       }
       return array;
    }

    public static int [] [] createRandomMatrix(int row, int column, int max) {
        int[][] matrix = createMatrix(row, column);
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = ArrayUtil.createRandomFilledArray(column, max);
        }
        return matrix;
    }
    static void printMatrix (int [][] matrix) {
        for (int [] array: matrix) {
            ArrayUtil.printArray(array);
        }
    }
}
